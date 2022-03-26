
package práctico1;

import java.util.Scanner;

public class Práctico1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Nombre del Curso: ");
        String nombreCurso=SC.next();
        System.out.println("Cantidad de Alumnos: ");
        int cantAlumnos=SC.nextInt();
        
        Curso C=new Curso(nombreCurso);
        
        for (int i = 0; i < cantAlumnos; i++) {
            
            System.out.println("Nombre del Alumno: ");
            String nombre=SC.next();
            System.out.println("Legajo: ");
            int legajo=SC.nextInt();
            System.out.println("Cantidad de notas: ");
            int cantNotas=SC.nextInt();
            
            Alumno A=new Alumno(nombre, legajo);
            
            for (int j = 0; j < cantNotas; j++) {
                
                System.out.println("Nota "+(1+j));
                int nota=SC.nextInt();
                
                A.agregarNotas(nota);
            }
            C.agregarAlumno(A);
        }
        
        System.out.println("Listado de Alumnos: "+C.toString());
        
        System.out.println("Promedio General del Curso: "+C.calcularPromedioG());
        
        System.out.println("Cantidad de Alumnos con Promedio mayor a 8: "+C.cantPromedio8());
    }
    
}
