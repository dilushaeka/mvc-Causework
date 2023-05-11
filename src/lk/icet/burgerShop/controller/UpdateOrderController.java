package lk.icet.burgerShop.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.icet.burgerShop.db.DataBase;
import lk.icet.burgerShop.model.Order;

import java.io.IOException;

public class UpdateOrderController {

    private static Order order=null;
    public ComboBox<String> cmbOrderId;
    public ComboBox<String> cmbOrderStts;
    public TextField txtCustId;
    public Button btnUpdateOrder;
    public Button btnCancel;
    public Button btnHomePage;
    public TextField txtCustName;
    public TextField txtBrgrQty;
    public TextField txtBillValue;

    public void initialize(){
        ObservableList<String> stts=FXCollections.observableArrayList("Deliverd","prepared","pending");
    }

    public void setOrderId(){
        ObservableList<String> ob= FXCollections.observableArrayList();
        Order[] orderArray= DataBase.orderArray;
//        for ( order  : ) {
//
//        }
    }
    public void cmbOrderOnAction(ActionEvent actionEvent) {

    }

    public void cmbOrderSttsOnAction(ActionEvent actionEvent) {
    }

    public void updateOnAction(ActionEvent actionEvent) {
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
    }

    public void btnHomePageOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrder.fxml"))));
        stage.show();

    }
}
