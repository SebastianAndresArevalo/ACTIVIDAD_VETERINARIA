package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

<<<<<<< HEAD
public class RegistroConsultaViewController {
=======
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
    private Label id;

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
        // Tomamos la última consulta registrada en Veterinaria
        if (!veterinaria.getListaConsultas().isEmpty()) {
            Consulta ultimaConsulta = veterinaria.getListaConsultas()
                    .get(veterinaria.getListaConsultas().size() - 1);

            // Mostramos los datos en los labels
            fecha.setText(ultimaConsulta.getFecha());
            hora.setText(ultimaConsulta.getHora());
            mascotaasig.setText(ultimaConsulta.getMascotaasig());
            veterinarioasig.setText(ultimaConsulta.getVeterinarioasig());
            motivo.setText(ultimaConsulta.getMotivo());
            diagnostico.setText(ultimaConsulta.getDiagnositco());
            tratamiento.setText(ultimaConsulta.getTratamiento());
            id.setText(ultimaConsulta.getId());
        } else {
            // Por si no hay ninguna consulta registrada
            fecha.setText("Sin datos");
            hora.setText("Sin datos");
            mascotaasig.setText("Sin datos");
            veterinarioasig.setText("Sin datos");
            motivo.setText("Sin datos");
            diagnostico.setText("Sin datos");
            tratamiento.setText("Sin datos");
            id.setText("Sin datos");
        }
    }



>>>>>>> dev_arevalo
}
