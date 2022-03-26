
package práctico1;

import java.util.ArrayList;

public class Curso {
    
    private String nombreCurso;
    private ArrayList alumnos;

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.alumnos = new ArrayList();
    }
    
    public void agregarAlumno(Alumno nuevoAlumno)
    {
        alumnos.add(nuevoAlumno);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < alumnos.size(); i++) {
            
            Alumno A=(Alumno) alumnos.get(i);
            listado+=A.getNombre()+"\n";           
        }
        return listado;
    }
    
    public float calcularPromedioG()
    {
        float promedio=0;
        float acumPromG=0;
        
        for (int i = 0; i < alumnos.size(); i++) {
            
            Alumno A=(Alumno)alumnos.get(i);
            acumPromG+=A.calcularPromedio();
            
        }
        return promedio=(acumPromG/alumnos.size());
    }
    
    public int cantPromedio8()
    {
        int contProm8=0;
        
        for (int i = 0; i < alumnos.size(); i++) {
            
            Alumno A=(Alumno) alumnos.get(i);
            if(A.calcularPromedio()>8)
            {
                contProm8++;
            }
        }
        return contProm8;
    }
    
}
