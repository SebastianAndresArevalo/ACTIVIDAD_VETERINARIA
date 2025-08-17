package co.edu.uniquindio.poo.actividad_veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.scene.Parent;
=======
>>>>>>> dev_arevalo
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
<<<<<<< HEAD
        // Carga el archivo FXML (debe estar en src/main/resources o en la carpeta resources)
        Parent root = FXMLLoader.load(getClass().getResource("/Pantallainicio.fxml")); // Cambia "nombre.fxml" por el tuyo

        primaryStage.setTitle("Mi Interfaz JavaFX"); // Título de la ventana
        primaryStage.setScene(new Scene(root));     // Coloca el FXML en la escena
        primaryStage.show();                        // Muestra la ventana
    }

    public static void main(String[] args) {
        launch(args); // Lanza la aplicación JavaFX
=======
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
>>>>>>> dev_arevalo
    }
}
