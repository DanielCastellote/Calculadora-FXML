module com.example.calculadorafxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadorafxml to javafx.fxml;
    exports com.example.calculadorafxml;
}