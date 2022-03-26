
package ejercitaciónpropuesta;

import java.util.ArrayList;

public class RecursosHumanos {
    
    private ArrayList personas;

    public RecursosHumanos() {
        this.personas = new ArrayList();
    }
    
    public void agregarPersona(Persona nuevaPersona)
    {
        personas.add(nuevaPersona);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < personas.size(); i++) {
            
            Persona P=(Persona)personas.get(i);
            listado+=P.toString()+"\n";
            
        }
        return listado;
    }
    
    public float totalSueldos()
    {
        float total=0;
        
        for (int i = 0; i < personas.size(); i++) {
            
            Persona P=(Persona)personas.get(i);
            
            total+=P.calcularSueldo();
            
        }
        return total;
    }
    
    public float totalPorTipo(int tipo)
    {
        float totalTipo=0;
        
        for (int i = 0; i < personas.size(); i++) {
            
            Persona P=(Persona)personas.get(i);
            
            if(P instanceof Empleado)
            {
                if(tipo==1)
                {
                    totalTipo+=P.calcularSueldo();
                }
            }
            if(P instanceof Jefe)
            {
                if(tipo==2)
                {
                    totalTipo+=P.calcularSueldo();
                }
            }

        }
        return totalTipo;
    }
}
