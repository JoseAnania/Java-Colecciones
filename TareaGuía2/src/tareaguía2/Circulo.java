
package tareaguía2;

public class Circulo extends Figura {
    
    private int radio;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Circulo(int radio, int numero) {
        super(numero);
        this.radio = radio;
    }
    
    @Override
    public double calcularSuperficie()
    {
        double superficie=0;
        
        superficie=3.14*(radio*radio);
        
        return superficie;
    }
    
    @Override
    public double calcularPerimetro()
    {
        double perimetro=0;
        
        perimetro=(2*3.14)*radio;
        
        return perimetro;
    }

    @Override
    public String toString() {
        return super.toString() + "radio=" + radio;
    }
    
    
}
