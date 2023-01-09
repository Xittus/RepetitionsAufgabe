package com.example.loginsap;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TransactionList {
    public Button productImport;
    @FXML
    private Button logout;

    public TransactionList() {
    }

    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }

    public void userImport(ActionEvent actionEvent) {

    }
}
