package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class PantallaInicioViewController {

    @FXML
    private Button AgConsultar;

    @FXML
    private Button ConsulCitas;

    @FXML
    private Button RegVeterinario;

    @FXML
    private Button CitadelDia;

    @FXML
    private void AgendarConsulta(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/AgendarConsulta.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void ConsultarCitas(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/BusquedaConsulta.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void RegistrarVeterinario(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/AgregarVeterinario.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void ConsultarCitasDelDia(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/BusquedaFecha.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

}
