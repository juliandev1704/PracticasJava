package teoria;
import java.util.Scanner;
public class condicionales {
    public static void main(String[] args) {
        //IF ELSE 
        /*int num1,num2;
        num1=15;
        num2=10;
        if (num1<num2) {
            System.out.println("El numero 2 es mayor que el numero 1");
        }
        else{
            if (num1==num2) {
                System.out.println("Los numeros son iguales");
            }
            else{
                System.out.println("El numero 1 es mayor que el numero 2");
            }
        } */
       //Switch
       /*int dia=7;
       String nombreDia;

       switch (dia) {
        case 1:
            nombreDia="Lunes";
            break;
        case 2:
            nombreDia="Martes";
            break;
        case 3:
            nombreDia="Miercoles";
            break;
        case 4:
            nombreDia="Jueves";
            break;
        case 5:
            nombreDia="Viernes";
            break;
        case 6:
            nombreDia="Sabado";
            break;
        case 7:
            nombreDia="Domingo";
            break;
        default:
            nombreDia="Numero de dia invalido";
            break;
       }
       System.out.println("el dia de la semana es: " + nombreDia); */
       //Operador Ternario (?)
       double promedio;
       String condicionfinal;

       Scanner teclado=new Scanner(System.in);

       System.out.println("Ingrese el promedio del alumno");
       promedio=teclado.nextDouble();
       teclado.close();

       condicionfinal = promedio>=6 ? "Aprobado":"Reprobado";
       System.out.println("El estado del estudiante es: "+condicionfinal);


    }
}
