
package práctico1;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private int legajo;
    private ArrayList notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new ArrayList();
    }
    
    public void agregarNotas(int nuevaNota)
    {
        notas.add(nuevaNota);
    }
    
    public float calcularPromedio()
    {
        float promedio=0;
        float acumNotas=0;
        
        for (int i = 0; i < notas.size(); i++) {
            
            Integer I=(Integer) notas.get(i) ;
            acumNotas+=I;
        }
        
        return promedio=(acumNotas/notas.size());
    }
    
}
