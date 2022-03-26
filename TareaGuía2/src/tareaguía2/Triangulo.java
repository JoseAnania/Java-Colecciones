
package tareaguía2;

public class Triangulo extends Figura{
    
    private int lado1;
    private int lado2;
    private int lado3;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(int lado1, int lado2, int lado3, int numero) {
        super(numero);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularSuperficie()
    {
        double superficie=0;
        
        superficie=Math.sqrt((lado1+lado2+lado3)+(-lado1+lado2+lado3)+(lado1-lado2+lado3)+(lado1+lado2-lado3)/16);
        
        return superficie;
    }
    
    
    @Override
    public double calcularPerimetro()
    {
        double perimetro=0;
        
        perimetro=(lado1+lado2+lado3);
        
        return perimetro;
    }

    @Override
    public String toString() {
        return super.toString() + " Lado 1=" + lado1 + " Lado 2=" + lado2 + " Lado 3=" + lado3;
    }
    
    
}
