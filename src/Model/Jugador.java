
package Model;

public class Jugador extends Persona{
    private String pocision;
    private double estatura;
    private double peso;
 
  

    public Jugador(String pocision, double estatura, double peso, int id, String nombre, String apellidos, double sueldo) {
        super(id, nombre, apellidos, sueldo);
        this.pocision = pocision;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getPocision() {
        return pocision;
    }

    public void setPocision(String pocision) {
        this.pocision = pocision;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
   
}
