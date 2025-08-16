package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

public class BusquedaFechaController {

    private final Veterinaria veterinaria;


    public BusquedaFechaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public Consulta buscarConsultaPorFecha(String fecha){

        return veterinaria.buscarConsultaporFecha(fecha);
    }
}
