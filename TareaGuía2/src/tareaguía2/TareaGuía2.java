
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Figuras: ");
        int cantFiguras=SC.nextInt();
        
        Geometria G=new Geometria();
        
        for (int i = 0; i < cantFiguras; i++) {
            
            System.out.println("Nº: ");
            int numero=SC.nextInt();
            
            System.out.println("Tipo de Figura: (1: Triángulo / 2: Círculo)");
            int tipoFigura=SC.nextInt();
            
            if(tipoFigura==1)
            {
                System.out.println("Lado 1: ");
                int lado1=SC.nextInt();
                System.out.println("Lado 2: ");
                int lado2=SC.nextInt();
                System.out.println("Lado 3: ");
                int lado3=SC.nextInt();
                
                G.agregarFigura(new Triangulo(lado1, lado2, lado3, numero));
            }
            
            if(tipoFigura==2)
            {
                System.out.println("Radio: ");
                int radio=SC.nextInt();
                
                G.agregarFigura(new Circulo(radio, numero));
            }
            
        }
        
        System.out.println("Listado: "+G.toString());
        
        System.out.println("Sumatoria de todas las Superficies: "+G.sumaSuperficies());
        
        System.out.println("El Triángulo con mayor perímetro es el Nº: "+G.trianguloMayor());
    }
    
}
