
package ejercitaciónpropuesta3;

public class LibroNacional extends Libro{
    
    private int provincia;

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public LibroNacional(int provincia, int codigo, String descripcion, int stock, int tipoLibro, float precio) {
        super(codigo, descripcion, stock, tipoLibro, precio);
        this.provincia = provincia;
    }
    
    @Override
    public float calcularPrecio()
    {
        float precioVenta=0;
        
        if(tipoLibro==1)
        {
            precioVenta=precio+40;
        }
        if(tipoLibro==2)
        {
            precioVenta=precio+50;
        }
        if(tipoLibro==3)
        {
            precioVenta=precio+60;
        }
        if(tipoLibro==4)
        {
            precioVenta=precio+70;
        }
        return precioVenta;
    }

    @Override
    public String toString() {
        return super.toString() + " Provincia=" + provincia;
    }
    
}
