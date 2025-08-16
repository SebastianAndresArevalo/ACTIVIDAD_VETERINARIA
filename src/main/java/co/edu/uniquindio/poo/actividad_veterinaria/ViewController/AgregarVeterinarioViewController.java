package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import co.edu.uniquindio.poo.actividad_veterinaria.Controller.AgendarConsultaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AgregarVeterinarioViewController {

    @FXML
    private TextField nombre;

    @FXML
    private TextField numerodelicencia;

    @FXML
    private TextField especialidad;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    private AgendarConsultaController controller = new AgendarConsultaController(veterinaria);

    @FXML
    private void RegresarInicio (ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }







}
