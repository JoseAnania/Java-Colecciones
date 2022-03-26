
package tareaclase1;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Empleado>empleados;

    public Empresa() {
        this.empleados = new ArrayList<Empleado>();
    }
    
    public void agregarEmpleado(Empleado nuevoEmpleado)
    {
        empleados.add(nuevoEmpleado);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (Empleado E : empleados) {
            
            listado+=E.toString()+"\n";
        }
        return listado;
    }
    
    public float sueldoPorTipo(int tipo)
    {
        float acumSueldo=0;
        
        for (Empleado E : empleados) {
            
            if(E instanceof Obrero)
            {
                if(tipo==1)
                {
                    acumSueldo+=E.calcularSueldo();
                }
            }
            if(E instanceof Administrativo)
            {
                if(tipo==2)
                {
                    acumSueldo+=E.calcularSueldo();
                }
            }
            if(E instanceof Vendedor)
            {
                if(tipo==3)
                {
                    acumSueldo+=E.calcularSueldo();
                }
            }
        }
        return acumSueldo;
    }
    
    public float totalSueldos()
    {
        float totalSueldos=0;
        
        for (Empleado E : empleados) {
            
            totalSueldos+=E.calcularSueldo();
        }
        return totalSueldos;
    }
    
}
