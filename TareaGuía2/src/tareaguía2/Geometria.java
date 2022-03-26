
package tareaguía2;

import java.util.ArrayList;

public class Geometria {
    
    private ArrayList figuras;

    public Geometria() {
        this.figuras = new ArrayList();
    }
    
    public void agregarFigura(Figura nuevaFigura)
    {
        figuras.add(nuevaFigura);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (int i = 0; i < figuras.size(); i++) {
            
            Figura F=(Figura)figuras.get(i);
            listado+=F.toString()+"\n";
            
        }
        return listado;
    }
    
    public float sumaSuperficies()
    {
        float acumSuperficies=0;
        
        for (int i = 0; i < figuras.size(); i++) {
            
            Figura F=(Figura)figuras.get(i);
            acumSuperficies+=F.calcularSuperficie();
            
        }
        return acumSuperficies;
    }
    
    public int trianguloMayor()
    {
        double mayor=0;
        int numMayor=0;
        
        for (int i = 0; i < figuras.size(); i++) {
            
            Figura F=(Figura)figuras.get(i);
            if(F instanceof Triangulo)
            {
                if(F.calcularPerimetro()>mayor)
                {
                    mayor=F.calcularPerimetro();
                    numMayor=F.getNumero();
                }
            }
        }
        return numMayor;
    }
    
}
