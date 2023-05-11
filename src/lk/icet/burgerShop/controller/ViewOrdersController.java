package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewOrdersController {
    public Button btnCancel;
    public Button btnViewAllOrder;
    public Button btnViewAllCustomer;
    public Button btnViewOrder;

    public void cancelOnAction(ActionEvent actionEvent) {
    }

    public void ViewAllOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAllOrders.fxml"))));
        stage.show();
    }


    public void viewAllCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewAllCustomers.fxml"))));
        stage.show();
    }

    public void viewOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewOrderDetails.fxml"))));
        stage.show();
    }
}
