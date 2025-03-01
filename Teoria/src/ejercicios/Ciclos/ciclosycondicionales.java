package ejercicios.Ciclos;
import java.util.Scanner;
public class ciclosycondicionales {
    public static void main(String[] args) {
        String nombre;
        int edad;
        int dni;
        String categoria="hola";
        System.out.println("Ingrese nombre");
        Scanner Nombre=new Scanner(System.in);
        nombre= Nombre.next();
        System.out.println("Ingrese edad");
        Scanner Edad=new Scanner(System.in);
        edad= Edad.nextInt();
        System.out.println("Ingrese dni");
        Scanner Dni=new Scanner(System.in);
        dni= Dni.nextInt();

        while (!nombre.equalsIgnoreCase("fin")) {
            while (dni!=(0)) {
                if (edad>6) {
                    if (edad<=10) {
                        categoria="Menores A";
                    }
                    if (edad<=17) {
                        categoria="Menores B";
                    }
                    if (edad<=30) {
                        categoria="Juveniles";
                    }
                    if (edad<=50) {
                        categoria="Adultos";
                    }
                    else{
                        categoria="Adultos Mayores";
                    }
                }
                else{
                    System.out.println("Edad invalida");
                }
                System.out.println(nombre+" pertenece a la categoria "+ categoria);
                System.out.println("Ingrese nombre");
                nombre= Nombre.next();
                System.out.println("Ingrese edad");
                edad= Edad.nextInt();
                System.out.println("Ingrese dni");
                dni= Dni.nextInt();
            }
        }
        Dni.close();
        Edad.close();
        Nombre.close();

    }
}
