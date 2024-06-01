module com.example.exceptions {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exceptions to javafx.fxml;
    exports com.example.exceptions;
}