
package ejercitaciónpropuesta;

public class Jefe extends Persona {
    
    private int antiguedad;

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Jefe(int antiguedad, int dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.antiguedad = antiguedad;
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        sueldo=antiguedad*600;
        
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Antiguedad=" + antiguedad;
    }
    
}
