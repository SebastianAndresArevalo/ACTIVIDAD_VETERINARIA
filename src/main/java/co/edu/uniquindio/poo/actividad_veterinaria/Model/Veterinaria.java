package co.edu.uniquindio.poo.actividad_veterinaria.Model;
import java.util.ArrayList;

public class Veterinaria {

    private String nombre;
    private String direccion;
    private ArrayList<Consulta> listaConsultas;
    private ArrayList<Veterinario> listaVeterinarios;
    private ArrayList<Mascota> listaMascotas;

    public Veterinaria(String nombre, String direccion) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.listaConsultas = new ArrayList<>();
        this.listaVeterinarios = new ArrayList<>();
        this.listaMascotas = new ArrayList<>();

    }

    public ArrayList<Consulta> getListaConsultas(int id) {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
        this.listaVeterinarios = listaVeterinarios;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public Consulta buscarConsultaPorId(int id) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getId() == id) {
                return consulta;
            }
        }
        return null; // no encontrada
    }

    public Consulta buscarConsulta(String fecha) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getFecha().equals(fecha)) {
                return consulta;
            }
        }
        return null;
    }

    public boolean actualizarConsulta(String fecha, Consulta consultaActualizada) {
        for (int i = 0; i < listaConsultas.size(); i++) {
            if (listaConsultas.get(i).getFecha().equals(fecha)) {
                listaConsultas.set(i, consultaActualizada);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarConsulta(String fecha) {
        return listaConsultas.removeIf(c -> c.getFecha().equals(fecha));
    }

    public String agregarVeterinario(Veterinario nuevoVeterinario) {
        if (buscarVeterinario(nuevoVeterinario.getNumerodelicencia()) != null) {
            return "Error: ya existe un veterinario con esa licencia.";
        }
        listaVeterinarios.add(nuevoVeterinario);
        return "Veterinario agregado exitosamente.";
    }

    public Veterinario buscarVeterinario(String numeroLicencia) {
        for (Veterinario v : listaVeterinarios) {
            if (v.getNumerodelicencia().equals(numeroLicencia)) {
                return v;
            }
        }
        return null;
    }

    public boolean actualizarVeterinario(String numeroLicencia, Veterinario veterinarioActualizado) {
        for (int i = 0; i < listaVeterinarios.size(); i++) {
            if (listaVeterinarios.get(i).getNumerodelicencia().equals(numeroLicencia)) {
                listaVeterinarios.set(i, veterinarioActualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarVeterinario(String numeroLicencia) {
        return listaVeterinarios.removeIf(v -> v.getNumerodelicencia().equals(numeroLicencia));
    }

    public ArrayList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public String agregarMascota(Mascota nuevaMascota) {
        if (buscarMascota(nuevaMascota.getId()) != null) {
            return "Error: ya existe una mascota con ese ID.";
        }
        listaMascotas.add(nuevaMascota);
        return "Mascota registrada exitosamente.";
    }


    public Mascota buscarMascota(int id) {
        for (Mascota m : listaMascotas) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }


    public boolean actualizarMascota(int id, Mascota mascotaActualizada) {
        for (int i = 0; i < listaMascotas.size(); i++) {
            if (listaMascotas.get(i).getId() == id) {
                listaMascotas.set(i, mascotaActualizada);
                return true;
            }
        }
        return false;
    }


    public boolean eliminarMascota(int id) {
        return listaMascotas.removeIf(m -> m.getId() == id);
    }


    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

}

