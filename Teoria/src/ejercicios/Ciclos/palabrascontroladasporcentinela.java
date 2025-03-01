package ejercicios.Ciclos;
import java.util.Scanner;

public class palabrascontroladasporcentinela {
    public static void main(String[] args) {
        String limite="salir";
        String i;
        System.out.println("Ingrese palabras que desea imprimir");
        Scanner teclado=new Scanner(System.in);
        i= teclado.next();
        while (!i.equalsIgnoreCase(limite)) {
            System.out.println("la palabra es "+i);
            System.out.println("Ingrese palabras que desea imprimir");
            i= teclado.next();
        }
        teclado.close();
    }
}
