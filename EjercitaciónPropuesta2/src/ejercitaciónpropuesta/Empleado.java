
package ejercitaciónpropuesta;

public class Empleado extends Persona {
    
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Empleado(int horas, int dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.horas = horas;
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        sueldo=horas*10;
        
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Horas=" + horas;
    }
    
}
