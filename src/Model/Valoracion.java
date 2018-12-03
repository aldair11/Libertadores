
package Model;


public class Valoracion {
    private String fecha;
    private String nombreJugador;
    private String obsmedica;
    private String obsfisica;

    public Valoracion(String fecha, String nombreJugador, String obsmedica, String obsfisica) {
        this.fecha = fecha;
        this.nombreJugador = nombreJugador;
        this.obsmedica = obsmedica;
        this.obsfisica = obsfisica;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getObsmedica() {
        return obsmedica;
    }

    public void setObsmedica(String obsmedica) {
        this.obsmedica = obsmedica;
    }

    public String getObsfisica() {
        return obsfisica;
    }

    public void setObsfisica(String obsfisica) {
        this.obsfisica = obsfisica;
    }
    
    
}
