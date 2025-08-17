package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

<<<<<<< HEAD
public class BusquedaFechaViewController {
=======
import co.edu.uniquindio.poo.actividad_veterinaria.Controller.BusquedaFechaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class BusquedaFechaViewController {

    @FXML
    private TextField fecha;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    BusquedaFechaController Controller = new BusquedaFechaController (veterinaria);

    @FXML
    private void RegresarInicio(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void DatosCorrectos(ActionEvent event) throws IOException {
        String FechaIngresada = fecha.getText();

        List<Consulta> consultas = Controller.buscarConsultasPorFecha(FechaIngresada);

        if (!consultas.isEmpty()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/CitasDelDia.fxml"));
            Scene scene = new Scene(loader.load());

            CitasDelDiaViewController citasController = loader.getController();
            citasController.setConsultas(consultas);

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

>>>>>>> dev_arevalo
}
