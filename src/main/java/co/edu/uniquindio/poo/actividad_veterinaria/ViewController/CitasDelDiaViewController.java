package co.edu.uniquindio.poo.actividad_veterinaria.ViewController;

<<<<<<< HEAD
public class CitasDelDiaViewController {
=======
import co.edu.uniquindio.poo.actividad_veterinaria.Controller.CitasDelDiaController;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class CitasDelDiaViewController {



    @FXML
    private ListView<Consulta> listaConsultas;

    private Veterinaria veterinaria = Veterinaria.getInstance();
    private CitasDelDiaController controller = new CitasDelDiaController(veterinaria);

    @FXML
    private void RegresarInicio(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Button)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    public void setConsultas(List<Consulta> consultas) {
        listaConsultas.setItems(FXCollections.observableArrayList(consultas));

        listaConsultas.setCellFactory(param -> new ListCell<>() {
            @Override
            protected void updateItem(Consulta consulta, boolean empty) {
                super.updateItem(consulta, empty);
                if (empty || consulta == null) {
                    setText(null);
                } else {
                    setText("📅 " + consulta.getFecha()
                            + " | ⏰ " + consulta.getHora()
                            + " | 🐶 " + consulta.getMascotaasig()
                            + " | 🩺 " + consulta.getVeterinarioasig());
                }
            }
        });
        }

        //Nos apoyamos con IA para este metodo, ya que nunca usamos una ListView 🐶
>>>>>>> dev_arevalo
}
