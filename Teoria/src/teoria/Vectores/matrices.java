package teoria.Vectores;
import java.util.Scanner;
public class matrices {
    public static void main(String[] args) {
        //declaracion
        int matriz [][]=new int[3][3];
        //asignacion
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("Escoja el valor de el indice f: "+f+" c: "+c);
                matriz[f][c]=teclado.nextInt();
            }
        }

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("el valor de la posicion f: "+f+" c: "+c);
                System.out.println("es de: "+matriz[f][c]);
            }
        }
        teclado.close();
    }
}
