package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

import co.edu.uniquindio.poo.actividad_veterinaria.Controller.AgendarConsultaController;
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

public class AgendarConsultaViewController {

    @FXML
    private TextField nombremascota;

    @FXML
    private TextField motivo;

    @FXML
    private TextField fecha;

    @FXML
    private TextField hora;

    @FXML
    private TextField veterinario;

    @FXML
    private TextField diagnostico;

    @FXML
    private TextField id;

    @FXML
    private TextField tratamiento;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    private AgendarConsultaController controller = new AgendarConsultaController(veterinaria);


    @FXML
    private void OnIrASegunda(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void guardarConsulta(ActionEvent event) throws IOException {

        String nombremascota = this.nombremascota.getText();
        String fecha = this.fecha.getText();
        String hora = this.hora.getText();
        String veterinario = this.veterinario.getText();
        String diagnostico = this.diagnostico.getText();
        String id = this.id.getText();
        String tratamiento = this.tratamiento.getText();
        String motivo = this.motivo.getText();

        Consulta nuevaConsulta = new Consulta(fecha, hora, nombremascota, veterinario, motivo, diagnostico, tratamiento, id);
        controller.agendarConsulta(nuevaConsulta);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/DatosGuardados.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();


    }

}
