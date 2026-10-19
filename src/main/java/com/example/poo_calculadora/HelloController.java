package com.example.poo_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField numAField;

    @FXML
    private TextField numBField;

    @FXML
    private Label resultadoLabel;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSumar() {
        int numA = Integer.parseInt(numAField.getText());
        int numB = Integer.parseInt(numBField.getText());
        int resultado = numA + numB;
        generarExpresionResultado(numA, numB, resultado, "+");

    }

    @FXML
    protected void onRestar() {
        int numA = Integer.parseInt(numAField.getText());
        int numB = Integer.parseInt(numBField.getText());
        int resultado = numA - numB;
        generarExpresionResultado(numA, numB, resultado, "-");

    }

    @FXML
    protected void onMultiplicar() {
        int numA = Integer.parseInt(numAField.getText());
        int numB = Integer.parseInt(numBField.getText());
        int resultado = numA * numB;
        generarExpresionResultado(numA, numB, resultado, "*");

    }

    @FXML
    protected void onDividir() {
        int numA = Integer.parseInt(numAField.getText());
        int numB = Integer.parseInt(numBField.getText());
        int resultado = numA / numB;
        generarExpresionResultado(numA, numB, resultado, "÷");

    }

    @FXML
    protected void onModulo() {
        int numA = Integer.parseInt(numAField.getText());
        int numB = Integer.parseInt(numBField.getText());
        int resultado = numA % numB;
        generarExpresionResultado(numA, numB, resultado, "mod");

    }

    @FXML
    protected void generarExpresionResultado(int numA, int numB, int resultado, String operacion) {
    resultadoLabel.setText(numA + " " + operacion + " " + numB + " = " + resultado);
    }

}
