package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.icet.burgerShop.db.DataBase;
import lk.icet.burgerShop.model.Customer;
import lk.icet.burgerShop.model.Order;

import java.io.IOException;

public class PlaceOrderController {
    public Label lblOrderId;
    public TextField txtCustId;
    public TextField txtCustName;
    public TextField txtbrgrQty;
    public TextField txtBillValue;
    public Button btnPlcOrder;
    public Button btnCancel;
    public Button btnHomePage;

    public void initialize(){
        setCustId();
    }
    public void placeOrderOnAction(ActionEvent actionEvent) {
        Customer cust=new Customer(txtCustId.getText(),txtCustName.getText());
        Order ord= new Order(lblOrderId.getText(),txtCustId.getText(),txtCustName.getText(),txtbrgrQty.getText(),"0");

        boolean isSaved =DataBase.custIcrement(cust)!=null;
        boolean issaved =DataBase.orderIncrement(ord)!=null;

        if (isSaved && issaved){
            new Alert(Alert.AlertType.CONFIRMATION,"Customer Saved").show();
            txtCustName.clear();
            txtCustId.clear();
            txtBillValue.clear();
            txtbrgrQty.clear();
            setCustId();
        }else {
            new Alert(Alert.AlertType.WARNING,"Please Try Again");
        }
    }

    public void cancelOnAction(ActionEvent actionEvent) {
        txtbrgrQty.clear();
        txtBillValue.clear();
        txtCustId.clear();
        txtCustName.clear();
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


}
