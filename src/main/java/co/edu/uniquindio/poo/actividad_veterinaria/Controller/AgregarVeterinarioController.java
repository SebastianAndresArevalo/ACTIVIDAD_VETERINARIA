package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;
import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinario;

public class AgregarVeterinarioController {

    private final Veterinaria veterinaria;

    public AgregarVeterinarioController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public void agregarVeterinario(Veterinario veterinario) {

        veterinaria.getListaVeterinarios().add(veterinario);

    }

}
