
package ejercitaciónpropuesta3;

import java.util.Scanner;

public class EjercitaciónPropuesta3 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Libros: ");
        int cantLibros=SC.nextInt();
        
        Editorial E=new Editorial();
        
        for (int i = 0; i < cantLibros; i++) {
            
            System.out.println("Código: ");
            int codigo=SC.nextInt();
            System.out.println("Descripción: ");
            String descripcion=SC.next();
            System.out.println("Stock disponible: ");
            int stock=SC.nextInt();
            System.out.println("Tipo de Libro: (1: Texto / 2: Manual / 3: Novela / 4: Infantil)");
            int tipoLibro=SC.nextInt();
            System.out.println("Precio: ");
            float precio=SC.nextFloat();
            System.out.println("Origen del Libro: (1: Nacional / 2: Internacional)");
            int origen=SC.nextInt();
            
            if(origen==1)
            {
                System.out.println("Provincia: (1: Córdoba / 2: Santa Fe / 3: Bs. As.)");
                int provincia=SC.nextInt();
                
                E.agregarLibro(new LibroNacional(provincia, codigo, descripcion, stock, tipoLibro, precio));
            }
            
            if(origen==2)
            {
                System.out.println("País: (1: Italia / 2: Francia / 3: Alemania)");
                int pais=SC.nextInt();
                
                E.agregarLibro(new LibroInternacional(pais, codigo, descripcion, stock, tipoLibro, precio));
            }
        }
        
        System.out.println("Precio de Venta de cada Libro: "+E.toString());
        
        System.out.println("Stock de Libros Internacionales: "+E.stockInternacionales());
        
        System.out.println("Libros Internacionales de Texto: "+E.internacionalesPorTipo(1));
        System.out.println("Libros Internacionales Manuales: "+E.internacionalesPorTipo(2));
        System.out.println("Libros internacionales Novelas: "+E.internacionalesPorTipo(3));
        System.out.println("Libros internacionales Infantiles: "+E.internacionalesPorTipo(4));
    }
    
}
