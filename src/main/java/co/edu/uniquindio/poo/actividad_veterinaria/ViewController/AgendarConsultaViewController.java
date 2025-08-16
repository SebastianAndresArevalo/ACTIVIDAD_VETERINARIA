package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class AgendarConsultaViewController {

    @FXML
    private Button aceptar;

    @FXML
    private Button regresar;

    @FXML
    private void OnIrASegunda(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = new Stage();


    }

}
