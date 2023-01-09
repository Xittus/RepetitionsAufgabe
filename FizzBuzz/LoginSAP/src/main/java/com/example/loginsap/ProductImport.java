package com.example.loginsap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class ProductImport {
    @FXML
    private Button submit;
    @FXML
    private TextField productName;
    @FXML
    private TextField stueckzahl;
    @FXML
    private TextField matnr;
    @FXML
    private TextField productDis;

    private static ArrayList<Product> products = new ArrayList<>();

    public void userBack(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("transactionlist.fxml");
    }

    public void userSubmit(ActionEvent actionEvent) throws IOException {
        products.add(new Product(matnr.getText().toString(), productName.getText().toString(), stueckzahl.getText().toString(), productDis.getText().toString()));
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("id: %d%nname: %s%nstueckzahl: %d%ndesc: %s%n", products.get(i).getId(), products.get(i).getProductName(), products.get(i).getAmount(), products.get(i).getDescription());
        }
        Main m = new Main();
        m.changeScene("transactionlist.fxml");
    }
}
