package ejercicios.vectores_matrices;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        double matriz[][]=new double [4][4];
        double suma = 0.0;
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
            System.out.println("Ingrese el nota para el alumno #: "+(f+1));
            matriz[f][c]=teclado.nextDouble();
            suma=suma+matriz[f][c];
            }
            matriz[f][3]=suma/3;
            suma=0.0;

        
        }
        for (int f = 0; f < matriz.length; f++) {
            System.out.println("las notas del alumo #: " + f +" son: ");
            for (int c = 0; c < matriz.length-1; c++) {
                System.out.println("nota #:"+c+matriz[f][c]);
            }
            System.out.println("el promedio de las notas es: "+matriz[f][3]);
        }
        teclado.close();
    }
}
