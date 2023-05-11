package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.icet.burgerShop.AppIntializer;


import java.io.IOException;

public class MainFormController {




    public void addCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddCustomer.fxml"))));
        stage.show();
    }

    public void placeOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PlaceOrder.fxml"))));
        stage.show();
    }

    public void viewOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewOrders.fxml"))));
        stage.show();
    }

    public void updateOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrder.fxml"))));
        stage.show();
    }

    public void exitOnAction(ActionEvent actionEvent) {
    }
}
