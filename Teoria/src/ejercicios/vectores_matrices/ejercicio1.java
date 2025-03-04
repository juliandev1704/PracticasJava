package ejercicios.vectores_matrices;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
            int vector[]=new int[15];
            int conteo=0;
            Scanner teclado = new Scanner(System.in);
            for (int i = 0; i < vector.length; i++) {
                System.out.println("ingrese el numero en el indice: "+i);
                vector[i]=teclado.nextInt();
                if (vector[i]==3) {
                    conteo=conteo+1;
                }
            }
            teclado.close();
            System.out.println("el numero de veces que está el numero 3 en el arreglo es: "+conteo);
    }
}
