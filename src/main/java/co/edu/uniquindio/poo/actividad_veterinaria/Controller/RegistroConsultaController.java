package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

public class RegistroConsultaController {

    private final Veterinaria veterinaria;


    public RegistroConsultaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public void MostrarConsultas(Consulta consulta) {

        veterinaria.getListaConsultas().add(consulta);

    }
}
