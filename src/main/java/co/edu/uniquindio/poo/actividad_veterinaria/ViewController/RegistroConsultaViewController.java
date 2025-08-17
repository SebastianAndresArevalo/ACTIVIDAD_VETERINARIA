package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import co.edu.uniquindio.poo.actividad_veterinaria.Controller.RegistroConsultaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroConsultaViewController {

    @FXML
    private Label fecha;

    @FXML
    private Label hora;

    @FXML
    private Label mascotaasig;

    @FXML
    private Label veterinarioasig;

    @FXML
    private Label diagnostico;

    @FXML
    private Label motivo;

    @FXML
    private Label tratamiento;

    @FXML
    private Label ID;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    private RegistroConsultaController controller = new RegistroConsultaController(veterinaria);

    @FXML
    private void RegresarInicio(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void MostrarConsultas(ActionEvent event) throws IOException {

        Consulta nuevaConsulta = new Consulta(
                fecha.getText(),
                hora.getText(),
                mascotaasig.getText(),
                veterinarioasig.getText(),
                motivo.getText(),
                diagnostico.getText(),
                tratamiento.getText(),
                ID.getText()
        );

        controller.MostrarConsultas(nuevaConsulta);

        fecha.setText(nuevaConsulta.getFecha());
        hora.setText(nuevaConsulta.getHora());
        mascotaasig.setText(nuevaConsulta.getMascotaasig());
        veterinarioasig.setText(nuevaConsulta.getVeterinarioasig());
        motivo.setText(nuevaConsulta.getMotivo());
        tratamiento.setText(nuevaConsulta.getTratamiento());
        diagnostico.setText(nuevaConsulta.getDiagnositco());

    }



}
