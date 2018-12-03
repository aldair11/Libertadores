
package Model;


public class Auxiliar extends Persona{
    private String labor;

    public Auxiliar(String labor, int id, String nombre, String apellidos, double sueldo) {
        super(id, nombre, apellidos, sueldo);
        this.labor = labor;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }
    
}
