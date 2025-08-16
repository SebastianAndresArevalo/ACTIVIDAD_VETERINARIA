package co.edu.uniquindio.poo.actividad_veterinaria.Model;

public class Consulta {

    private String id;
    private String fecha;
    private String hora;
    private String mascotaasig;
    private String veterinarioasig;
    private String motivo;
    private String diagnositco;
    private String tratamiento;

    public Consulta(String fecha, String hora, String mascotaasig, String veterinarioasig, String motivo, String diagnostico, String tratamiento, String id) {

        this.fecha = fecha;
        this.hora = hora;
        this.mascotaasig = mascotaasig;
        this.veterinarioasig = veterinarioasig;
        this.motivo = motivo;
        this.diagnositco = diagnostico;
        this.tratamiento = tratamiento;
        this.id = id;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMascotaasig() {
        return mascotaasig;
    }

    public void setMascotaasig(String mascotaasig) {
        this.mascotaasig = mascotaasig;
    }

    public String getVeterinarioasig() {
        return veterinarioasig;
    }

    public void setVeterinarioasig(String veterinarioasig) {
        this.veterinarioasig = veterinarioasig;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnositco() {
        return diagnositco;
    }

    public void setDiagnositco(String diagnositco) {
        this.diagnositco = diagnositco;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", mascotaasig='" + mascotaasig + '\'' +
                ", veterinarioasig='" + veterinarioasig + '\'' +
                ", motivo='" + motivo + '\'' +
                ", diagnositco='" + diagnositco + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                '}';
    }



}
