
package Model;


public class Entrenador extends Persona{
    private String tipo;

    public Entrenador(String tipo, int id, String nombre, String apellidos, double sueldo) {
        super(id, nombre, apellidos, sueldo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
