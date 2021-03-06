
package tareaclase1;

public abstract class Empleado {
    
    private int legajo;
    private String nombre;
    protected float sueldoBasico;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }
    
    public abstract float calcularSueldo();

    @Override
    public String toString() {
        return "Legajo=" + legajo + " Nombre=" + nombre + " Sueldo Básico=" + sueldoBasico + " Sueldo Neto="+calcularSueldo();
    }
    
    
}
