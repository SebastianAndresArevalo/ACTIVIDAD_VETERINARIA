package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

import java.util.List;
import java.util.stream.Collectors;

public class CitasDelDiaController {
    private final Veterinaria veterinaria;

    public CitasDelDiaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public List<Consulta> buscarPorFecha(String fecha) {
        return veterinaria.getListaConsultas()
                .stream()
                .filter(c -> c.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }
}
