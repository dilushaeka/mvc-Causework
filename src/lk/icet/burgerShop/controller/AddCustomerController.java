package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import lk.icet.burgerShop.db.DataBase;
import lk.icet.burgerShop.model.Customer;
import lk.icet.burgerShop.model.Order;

import java.io.IOException;

public class AddCustomerController {
    public TextField txtBrgrQty;
    public TextField txtBilValue;
    public TextField txtCustNAme;
    public TextField txtCustId;
    public Label lblOrderId;
    public Button txtPlaceOrder;
    public Button btnCancel;
    public Button btnHomePage;


    public void initialize(){
        setCustId();
//        fillData();
    }
    public void placeOrderOnAction(ActionEvent actionEvent){
        Customer cust=new Customer(txtCustId.getText(),txtCustNAme.getText());
        Order ord= new Order(lblOrderId.getText(),txtCustId.getText(),txtCustNAme.getText(),txtBrgrQty.getText(),"0");

        boolean isSaved =DataBase.custIcrement(cust)!=null;
        boolean issaved =DataBase.orderIncrement(ord)!=null;

        if (isSaved && issaved){
            new Alert(Alert.AlertType.CONFIRMATION,"Customer Saved").show();
            txtCustNAme.clear();
            txtCustId.clear();
            txtBilValue.clear();
            txtBrgrQty.clear();
            setCustId();
        }else {
            new Alert(Alert.AlertType.WARNING,"Please Try Again");
        }
    }
    public void cancelOnAction(ActionEvent actionEvent) {
        txtBrgrQty.clear();
        txtBilValue.clear();
        txtCustId.clear();
        txtCustNAme.clear();
        lblOrderId.setText(setCustId());
    }

    public void homePageOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrder.fxml"))));
        stage.show();
    }

    private String setCustId(){
        System.out.println(DataBase.orderArray.length);
        if(DataBase.orderArray.length< 1){
            lblOrderId.setText("o-0001");
            return null;
        }

        String tempOrderID = DataBase.orderArray[DataBase.orderArray.length - 1].getoId();
        String array[] = tempOrderID.split("-");
        int tempNum = Integer.parseInt(array[1]);
        int finalOrderID = tempNum + 1;
        lblOrderId.setText("o-000" + finalOrderID);
        return tempOrderID;
    }


    public void fillData(KeyEvent keyEvent) {
        int value = 500*(Integer.parseInt(txtBrgrQty.getText()));
        txtBilValue.setText(String.valueOf(value));
    }

}
