module com.example.poo_calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.example.poo_calculadora to javafx.fxml;
    exports com.example.poo_calculadora;
}