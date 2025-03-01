package ejercicios.Ciclos;
import java.util.Scanner;

public class Mostrarnumeroshastaellimite {
    public static void main(String[] args) {
        int limite;
        int i=1;
        System.out.println("Ingrese el limite deseado");
        Scanner teclado=new Scanner(System.in);
        limite= teclado.nextInt();
            teclado.close();
        while (i<=limite) {
            System.out.println(i);
            i=i+1;
        }
    }
}
