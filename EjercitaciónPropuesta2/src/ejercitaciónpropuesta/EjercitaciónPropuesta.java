
package ejercitaciónpropuesta;

import java.util.Scanner;

public class EjercitaciónPropuesta {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Personas: ");
        int cantPersonas=SC.nextInt();
        
        RecursosHumanos RH=new RecursosHumanos();
        
        for (int i = 0; i < cantPersonas; i++) {
            
            System.out.println("Ingrese DNI: ");
            int dni=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Edad de "+nombre);
            int edad=SC.nextInt();
            System.out.println("Tipo: (1: Empleado / 2: Jefe)");
            int tipo=SC.nextInt();
            
            if(tipo==1)
            {
                System.out.println("Cantidad de horas trabajadas: ");
                int horas=SC.nextInt();
                
                RH.agregarPersona(new Empleado(horas, dni, nombre, edad));
            }
            
            if(tipo==2)
            {
                System.out.println("Antiguedad: ");
                int antiguedad=SC.nextInt();
                
                RH.agregarPersona(new Jefe(antiguedad, dni, nombre, edad));
            }
        }
        
        System.out.println("Listado: "+RH.toString());
        
        System.out.println("Total de Sueldos Pagados: "+RH.totalSueldos());
        
        System.out.println("Total de Sueldos de Empleados: "+RH.totalPorTipo(1));
        System.out.println("Total de Sueldos de Jefes: "+RH.totalPorTipo(2));
    }
    
}
