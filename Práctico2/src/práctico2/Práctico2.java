
package práctico2;

import java.util.Scanner;

public class Práctico2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Empleados: ");
        int cantEmpleados=SC.nextInt();
        
        Empresa EM=new Empresa();
        
        for (int i = 0; i < cantEmpleados; i++) {
            
            System.out.println("Legajo del Empleado: ");
            int legajo=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Sueldo Básico: ");
            float sueldoBasico=SC.nextFloat();
            System.out.println("Tipo de Empleado: (1: Obrero / 2: Administrativo / 3: Vendedor)");
            int tipoEmpleado=SC.nextInt();
            
            if(tipoEmpleado==1)
            {
                System.out.println("Cantidad de días trabajados: ");
                int diasTrabajados=SC.nextInt();
                EM.agregarEmpleado(new Obrero(diasTrabajados, legajo, nombre, sueldoBasico));
            }
            
            if(tipoEmpleado==2)
            {
                System.out.println("Presentismo: (1: Si / 2: No)");
                int pres=SC.nextInt();
                boolean presentismo=false;
                if(pres==1)
                {
                    presentismo=true;
                }
                EM.agregarEmpleado(new Administrativo(presentismo, legajo, nombre, sueldoBasico));
            }
            
            if(tipoEmpleado==3)
            {
                System.out.println("Total de Ventas: ");
                float totalVentas=SC.nextFloat();
                EM.agregarEmpleado(new Vendedor(totalVentas, legajo, nombre, sueldoBasico));
            }
            
        }
        
        System.out.println("Listado: "+EM.toString());
        
        System.out.println("Total de sueldos de Obreros: "+EM.sueldoPorTipo(1));
        System.out.println("Total de sueldos de Administrativos: "+EM.sueldoPorTipo(2));
        System.out.println("Total de sueldos de Vendedores: "+EM.sueldoPorTipo(3));
        
        System.out.println("Total de Sueldos Netos: "+EM.totalSueldos());
    }
    
}
