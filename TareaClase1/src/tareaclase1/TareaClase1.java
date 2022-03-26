
package tareaclase1;

import java.util.Scanner;

public class TareaClase1 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Empleados: ");
        int cantEmpleados=SC.nextInt();
        
        Empresa E=new Empresa();
        
        for (int i = 0; i < cantEmpleados; i++) {
            
            System.out.println("Legajo: ");
            int legajo=SC.nextInt();
            System.out.println("Nombre: ");
            String nombre=SC.next();
            System.out.println("Sueldo Básico: ");
            float sueldoBasico=SC.nextFloat();
            System.out.println("Tipo de Empleado: (1: Obrero / 2: Administrativo / 3: Vendedor)");
            int tipo=SC.nextInt();
            
            if(tipo==1)
            {
                System.out.println("Cantidad de Días Trabajados: ");
                int diasTrabajados=SC.nextInt();
                
                E.agregarEmpleado(new Obrero(diasTrabajados, legajo, nombre, sueldoBasico));
            }
            if(tipo==2)
            {
                System.out.println("Ingrese Presentismo: (1: Si / 2: no)");
                int pres=SC.nextInt();
                boolean presentismo=false;
                if(pres==1)
                {
                    presentismo=true;
                }
                E.agregarEmpleado(new Administrativo(presentismo, legajo, nombre, sueldoBasico));
            }
            if(tipo==3)
            {
                System.out.println("Total de Ventas: ");
                float totalVentas=SC.nextFloat();
                
                E.agregarEmpleado(new Vendedor(totalVentas, legajo, nombre, sueldoBasico));
            }
        }
        System.out.println("Listado de Empleados: "+E.toString());
        
        System.out.println("Total a pagar a Obreros: "+E.sueldoPorTipo(1));
        System.out.println("Total a pagar a Administrativos: "+E.sueldoPorTipo(2));
        System.out.println("Total a pagar a Vendedores: "+E.sueldoPorTipo(3));
        
        System.out.println("Total a Pagar: "+E.totalSueldos());
    }
    
}
