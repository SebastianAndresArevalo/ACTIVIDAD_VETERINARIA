package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

import java.util.Collection;

public class BusquedaConsultaController {

    private final Veterinaria veterinaria;


    public BusquedaConsultaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public Collection<Consulta> obtenerListaConsulta(int id) {

        return veterinaria.getListaConsultas(id);

    }

    public Consulta buscarConsultaPorId(String id) {
        return veterinaria.buscarConsulta(id);
    }

}
