module com.example.loginsap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginsap to javafx.fxml;
    exports com.example.loginsap;
}