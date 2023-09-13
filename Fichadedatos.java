
package fichadedatos;
import java.util.Scanner;

public class Fichadedatos {

  
    public static void main(String[] args) {
    Scanner lectura= new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String  nombre=lectura.nextLine();
        
        System.out.println("Escribe tu edad");
        int edad =lectura.nextInt();
        
        System.out.println("Escribe tu telelfono");
        String telefono=lectura.nextLine();
        
        System.out.println("Escribe tu correo");
        String correo=lectura.nextLine();
        
        System.out.println("Escribe tus redes sociales");
        String redes=lectura.nextLine();
    }
    
}
