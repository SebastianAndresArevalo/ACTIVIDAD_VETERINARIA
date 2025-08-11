package co.edu.uniquindio.poo.actividad_veterinaria.Model;

public class Veterinario extends Persona{

    private String especialidad;
    private String numerodelicencia;

    public Veterinario(String nombre, String especialidad, String numerodelicencia) {

        super(nombre);
        this.especialidad = especialidad;
        this.numerodelicencia = numerodelicencia;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumerodelicencia() {
        return numerodelicencia;
    }

    public void setNumerodelicencia(String numerodelicencia) {
        this.numerodelicencia = numerodelicencia;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "especialidad='" + especialidad + '\'' +
                ", numerodelicencia='" + numerodelicencia + '\'' +
                '}';
    }
}
