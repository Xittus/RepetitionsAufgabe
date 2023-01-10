package com.example.loginsap;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TransactionList {
    private static ArrayList<Product> products;
    public Button productImport;
    @FXML
    private Button logout;

    @FXML
    private Button go;
    @FXML
    private TextField search;
    @FXML
    private Label product1;
    @FXML
    private Label product2;
    @FXML
    private Label product3;

    @FXML
    private void initialize() throws IOException {
        ProductImport.addItem(0, new Product("1", "Fanta", "8", null));
        ProductImport.addItem(1, new Product("2", "Cola", "24", null));
        ProductImport.addItem(2, new Product("3", "RedBull", "4", null));

        products = ProductImport.getProducts();

        product1.setText("id: " + products.get(products.size()-3).getId() + ", name: " + products.get(products.size()-3).getProductName());
        product2.setText("id: " + products.get(products.size()-2).getId() + ", name: " + products.get(products.size()-2).getProductName());
        product3.setText("id: " + products.get(products.size()-1).getId() + ", name: " + products.get(products.size()-1).getProductName());
    }

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("login.fxml");
    }

    public void userImport(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("productImport.fxml");
    }

    public void userGo(ActionEvent actionEvent) {
        /*search.getText().toString()*/
    }
}
