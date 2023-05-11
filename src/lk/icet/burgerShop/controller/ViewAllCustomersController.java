package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewAllCustomersController {
    public TableView tblAllCustomers;
    public TableColumn colCustId;
    public TableColumn colCustName;
    public Button btnHome;
    public TableColumn coltotalValue;
    public Button btnBackHome;

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrder.fxml"))));
        stage.show();
    }
}
