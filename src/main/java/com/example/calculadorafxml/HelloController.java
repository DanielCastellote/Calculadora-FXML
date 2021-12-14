package com.example.calculadorafxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{

    private Modelo md= new Modelo();

    @FXML
    private Label numeros;

    @FXML
    public void manejarBotonNumerico(ActionEvent e) {
        numeros.setText(numeros.getText()+((Button) e.getSource()).getText());

    }
    @FXML
    public void manejarBotonOperacion(ActionEvent e) {
        md.setOperador1(Double.parseDouble(numeros.getText()));
        md.setTipoOperator(((Button) e.getSource()).getText());
        numeros.setText("");
    }
    @FXML
    public void manejarBotonResultado(ActionEvent e) {
        md.setOperador2(Double.parseDouble(numeros.getText()));
        numeros.setText(""+md.getResultado());

    }
    @FXML
    public void limpiar(ActionEvent e) {
        numeros.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}