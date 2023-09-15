
package calculadorademoendas;
import java.util.Scanner;

public class Calculadorademoendas {

  
    public static void main(String[] args) {
        System.out.println("Ingresa una cantidad en pesos");
        Scanner lectura=new Scanner(System.in);
        int pesos=lectura.nextInt();
        double euro=pesos/18.21;
        double dolares=pesos/17.07;
        double yen=pesos/0.12;
        double libras=pesos/21.18;
        System.out.println("El valor ingresa en pesos a euro es "+ euro);
        System.out.println("El valor ingresado en pesos a dolares es "+dolares);
        System.out.println("El valoe ingresado en pesos a yen es "+yen);
        System.out.println("El valor ingresado en pesos a libras es "+libras);
    }
    
}
