
package práctico2;

public class Obrero extends Empleado{
    
    private int diasTrabajados;

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public Obrero(int diasTrabajados, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        sueldo=(sueldoBasico/22)*diasTrabajados;
        
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Días Trabajados=" + diasTrabajados;
    }
    
}
