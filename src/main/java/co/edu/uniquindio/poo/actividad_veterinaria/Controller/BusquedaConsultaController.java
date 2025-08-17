package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

<<<<<<< HEAD
public class BusquedaConsultaController {
=======
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

public class BusquedaConsultaController {

    private final Veterinaria veterinaria;


    public BusquedaConsultaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public Consulta buscarConsultaPorId(String id) {
        return veterinaria.buscarConsulta(id);
    }

>>>>>>> dev_arevalo
}
