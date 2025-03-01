package ejercicios.Ciclos;
import java.util.Scanner;
public class arboldenavidad {
    public static void main(String[] args) {
        int altura;
        System.out.println("Ingrese tamaño del arbol");
        Scanner teclado=new Scanner(System.in);
        altura=teclado.nextInt();
        int largoTronco;
        System.out.println("Ingrese tamaño del tronco");
        Scanner teclado2=new Scanner(System.in);
        largoTronco=teclado2.nextInt();
        teclado.close();
        teclado2.close();
        for(int fila=0;fila<altura;fila++){
            for(int espacio=0;espacio<(altura-fila-1);espacio++){
                System.out.print(" ");
            }
            for(int asterisco=0;asterisco<(fila*2)+1;asterisco++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int base=0; base<largoTronco;base++){
            for(int espacio=0;espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
            for(int tronco=0;tronco<3;tronco++){
                System.out.print("|");
            }
            System.out.println("");
        }
        

    }
}
