package lk.icet.burgerShop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewOrderDetailsController {
    public Button btnBackToHome;
    public TextField txtOrderId;
    public Label lblCustId;
    public Label lblCustName;
    public Label lblBurgerQty;
    public Label lblBillValue;
    public Label lblOrderStts;

    public void backHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.setTitle("Add Customer");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UpdateOrder.fxml"))));
        stage.show();
    }
}
