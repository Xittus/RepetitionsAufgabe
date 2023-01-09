module com.example.saplogonfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.saplogonfx to javafx.fxml;
    exports com.example.saplogonfx;
}