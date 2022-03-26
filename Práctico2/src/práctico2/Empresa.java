
package práctico2;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList empleados;

    public Empresa() {
        this.empleados = new ArrayList();
    }
    
    public void agregarEmpleado(Empleado nuevoEmpleado)
    {
        empleados.add(nuevoEmpleado);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < empleados.size(); i++) {
            
            Empleado E=(Empleado)empleados.get(i);
            listado+=E.toString()+"\n";
        }
        return listado;
    }
    
    public float sueldoPorTipo(int tipoEmpleado)
    {
        float acumSueldo=0;
        
        for (int i = 0; i < empleados.size(); i++) {
            
            Empleado E=(Empleado)empleados.get(i);
            
            if(E instanceof Obrero)
            {
                if(tipoEmpleado==1)
                {
                    acumSueldo+=E.calcularSueldo();
                }
            }
            if(E instanceof Administrativo)
            {
                if(tipoEmpleado==2)
                {
                    acumSueldo+=E.calcularSueldo();
                }              
            }
            if(E instanceof Vendedor)
            {
                if(tipoEmpleado==3)
                {
                    acumSueldo+=E.calcularSueldo();
                }               
            }
        }
        return acumSueldo;
    }
    
    public float totalSueldos()
    {
        float total=0;
        
        for (int i = 0; i < empleados.size(); i++) {
            
            Empleado E=(Empleado)empleados.get(i);
            
            total+=E.calcularSueldo();
            
        }
        
        return total;
    }
    
}
