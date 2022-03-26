package tareaguía2;


public abstract class Figura {
    
    protected int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Figura(int numero) {
        this.numero = numero;
    }
    
    public abstract double calcularSuperficie();
    
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Número=" + numero+" Superficie="+calcularSuperficie()+" Perímetro="+calcularPerimetro();
    }
    
    

}
