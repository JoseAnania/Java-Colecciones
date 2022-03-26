package ejercitaciónpropuesta;

public abstract class Persona {
    
    protected int dni;
    protected String nombre;
    protected int edad;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(int dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract float calcularSueldo();

    @Override
    public String toString() {
        return "D.N.I.=" + dni + " Nombre=" + nombre + " Edad=" + edad + " Sueldos="+calcularSueldo();
    }
    
    
}
