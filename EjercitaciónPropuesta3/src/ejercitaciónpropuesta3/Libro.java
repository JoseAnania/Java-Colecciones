
package ejercitaciónpropuesta3;

public abstract class Libro {
    
    protected int codigo;
    protected String descripcion;
    protected int stock;
    protected int tipoLibro;
    protected float precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(int tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Libro(int codigo, String descripcion, int stock, int tipoLibro, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.tipoLibro = tipoLibro;
        this.precio = precio;
    }
    
    public abstract float calcularPrecio();

    @Override
    public String toString() {
        return " Código=" + codigo + " Descripcion=" + descripcion + " Stock=" + stock + " Tipo de Libro=" + tipoLibro + " Precio=" + precio+" Precio de Venta="+calcularPrecio();
    }
    
}
