module com.example.javafxcw2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcw2 to javafx.fxml;
    exports com.example.javafxcw2;
}