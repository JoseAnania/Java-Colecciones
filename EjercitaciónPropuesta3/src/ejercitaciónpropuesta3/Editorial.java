
package ejercitaciónpropuesta3;

import java.util.ArrayList;

public class Editorial {
    
    private ArrayList libros;

    public Editorial() {
        this.libros = new ArrayList();
    }
    
    public void agregarLibro(Libro nuevoLibro)
    {
        libros.add(nuevoLibro);
    }

    @Override
    public String toString() {
        String listado="\n";
        
        for (int i = 0; i < libros.size(); i++) {
            
            Libro L=(Libro)libros.get(i);
            
            listado+=L.toString()+"\n";
            
        }
        return listado;
    }
    
    public int stockInternacionales()
    {
        int stockInt=0;
        
        for (int i = 0; i < libros.size(); i++) {
            
            Libro L=(Libro)libros.get(i);
            if(L instanceof LibroInternacional)
            {
                stockInt+=L.getStock();
            }
        }
        return stockInt;
    }
    
    public int internacionalesPorTipo(int tipo)
    {
        int intTipo=0;
        
        for (int i = 0; i < libros.size(); i++) {
            
            Libro L=(Libro)libros.get(i);
            
            if(L instanceof LibroInternacional)
            {
                if(L.getTipoLibro()==tipo)
                {
                    intTipo++;
                }
            }
        }
        return intTipo;
    }
    
}
