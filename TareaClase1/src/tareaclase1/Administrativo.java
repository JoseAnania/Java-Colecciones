
package tareaclase1;

public class Administrativo extends Empleado{
    
    private boolean presentismo;

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    public Administrativo(boolean presentismo, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }
    
    @Override
    public float calcularSueldo()
    {
        float sueldo=0;
        
        if(presentismo==true)
        {
            sueldo=sueldoBasico*1.13f;
        }
        else
        {
            sueldo=sueldoBasico;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Presentismo=" + presentismo;
    }
    
}
