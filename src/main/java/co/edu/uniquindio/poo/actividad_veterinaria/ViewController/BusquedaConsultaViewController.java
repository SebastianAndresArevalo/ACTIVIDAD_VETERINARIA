package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import co.edu.uniquindio.poo.actividad_veterinaria.Controller.BusquedaConsultaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;

public class BusquedaConsultaViewController {

    @FXML
    private TextField IDConsulta;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    BusquedaConsultaController Controller = new BusquedaConsultaController (veterinaria);


    @FXML
    private void RegresarInicio(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void DatoCorrecto(ActionEvent event) throws IOException {

        String IDIngresado = IDConsulta.getText();

        Consulta consulta = Controller.buscarConsultaPorId(IDIngresado);

        if (consulta != null) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/RegistroConsulta.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/Error.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

    }


}
