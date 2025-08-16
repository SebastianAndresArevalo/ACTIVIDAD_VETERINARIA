package co.edu.uniquindio.poo.actividad_veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga el archivo FXML (debe estar en src/main/resources o en la carpeta resources)
        Parent root = FXMLLoader.load(getClass().getResource("/Pantallainicio.fxml")); // Cambia "nombre.fxml" por el tuyo

        primaryStage.setTitle("Mi Interfaz JavaFX"); // Título de la ventana
        primaryStage.setScene(new Scene(root));     // Coloca el FXML en la escena
        primaryStage.show();                        // Muestra la ventana
    }

    public static void main(String[] args) {
        launch(args); // Lanza la aplicación JavaFX
    }
}
