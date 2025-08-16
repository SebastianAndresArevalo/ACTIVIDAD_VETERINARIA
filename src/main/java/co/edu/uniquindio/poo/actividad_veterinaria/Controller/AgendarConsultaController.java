package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

public class AgendarConsultaController {

    private final Veterinaria veterinaria;


    public AgendarConsultaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public void agendarConsulta(Consulta consulta) {

        veterinaria.getListaConsultas().add(consulta);

    }

}
