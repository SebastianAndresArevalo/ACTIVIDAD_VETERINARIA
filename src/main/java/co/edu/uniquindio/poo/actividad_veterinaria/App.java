package co.edu.uniquindio.poo.actividad_veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/co/edu/uniquindio/poo/actividad_veterinaria/PantallaInicio.fxml"
        ));
        Scene scene = new Scene(loader.load());

        primaryStage.setTitle("Veterinaria - Inicio");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
