<<<<<<< HEAD
package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

public class BusquedaFechaController {
}
=======
    package co.edu.uniquindio.poo.actividad_veterinaria.Controller;

    import co.edu.uniquindio.poo.actividad_veterinaria.Model.Consulta;
    import co.edu.uniquindio.poo.actividad_veterinaria.Model.Veterinaria;

    import java.util.List;

    public class BusquedaFechaController {

        private final Veterinaria veterinaria;


        public BusquedaFechaController(Veterinaria veterinaria) {
            this.veterinaria = veterinaria;
        }

        public List<Consulta> buscarConsultasPorFecha(String fecha){
            return veterinaria.buscarConsultasPorFecha(fecha);
        }

    }
>>>>>>> dev_arevalo
