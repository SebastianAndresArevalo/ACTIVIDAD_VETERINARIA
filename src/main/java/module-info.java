module co.edu.uniquindio.poo.actividad_veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.actividad_veterinaria to javafx.fxml;
    opens co.edu.uniquindio.poo.actividad_veterinaria.ViewController to javafx.fxml;
    exports co.edu.uniquindio.poo.actividad_veterinaria;
    exports co.edu.uniquindio.poo.actividad_veterinaria.Controller;
    opens co.edu.uniquindio.poo.actividad_veterinaria.Controller to javafx.fxml;
}