package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import co.edu.uniquindio.poo.actividad_veterinaria.Controller.AgendarConsultaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Controller.AgregarVeterinarioController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinario;
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
    private AgregarVeterinarioController controller = new AgregarVeterinarioController(veterinaria);

    @FXML
    private void RegresarInicio (ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void AgregarVeterinario (ActionEvent event) throws IOException {

        String nombre = this.nombre.getText();
        String numerodelicencia = this.numerodelicencia.getText();
        String especialidad = this.especialidad.getText();

        Veterinario nuevoveterinario = new Veterinario(nombre, numerodelicencia, especialidad);
        controller.agregarVeterinario(nuevoveterinario);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/DatosGuardados.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }







}
