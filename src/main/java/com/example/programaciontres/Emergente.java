package com.example.programaciontres;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Emergente {
    @FXML
    private Pane pane_auto;

    @FXML
    private  Pane pane_camion;

    @FXML
    private Pane pane_moto;


    @FXML
    private Label placa_auto;

    @FXML
    private Label placa_camion;

    @FXML
    private Label placa_moto;



    @FXML
    void OnSiguiente(ActionEvent event) {
        if(Menu.indice.equals("Moto")){
            pane_moto.toFront();
            placa_moto.setText(Menu.placaAux);
        }else if(Menu.indice.equals("Auto")) {
            pane_auto.toFront();
            placa_auto.setText(Menu.placaAux);
        }else if (Menu.indice.equals("Camión")) {
            pane_camion.toFront();
            placa_camion.setText(Menu.placaAux);
        }


    }

    @FXML
    void OnCerrarVentana(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();


    }
}
