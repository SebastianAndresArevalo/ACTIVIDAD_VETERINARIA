package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroConsultaViewController {

    @FXML
    private Button regresar;

    @FXML
    private Button aceptar;

    @FXML
    private void RegresarInicio(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }

}
