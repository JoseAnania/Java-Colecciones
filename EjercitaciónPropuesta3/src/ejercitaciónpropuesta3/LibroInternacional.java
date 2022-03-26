
package ejercitaciónpropuesta3;

public class LibroInternacional extends Libro{
    
    private int pais;

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public LibroInternacional(int pais, int codigo, String descripcion, int stock, int tipoLibro, float precio) {
        super(codigo, descripcion, stock, tipoLibro, precio);
        this.pais = pais;
    }
    
    @Override
    public float calcularPrecio()
    {
        float precioVenta=0;
        
        if(tipoLibro==1)
        {
            precioVenta=(precio+40)*1.2f;
        }
        if(tipoLibro==2)
        {
            precioVenta=(precio+50)*1.2f;
        }
        if(tipoLibro==3)
        {
            precioVenta=(precio+60)*1.2f;
        }
        if(tipoLibro==4)
        {
            precioVenta=(precio+70)*1.2f;
        }
        return precioVenta;
    }

    @Override
    public String toString() {
        return super.toString() + " País=" + pais;
    }
    
}
