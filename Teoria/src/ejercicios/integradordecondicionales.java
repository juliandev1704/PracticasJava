package ejercicios;
import java.util.Scanner;
public class integradordecondicionales {
    public static void main(String[] args) {
        int tipodetrabajador;
        String ocupacion;
        double sueldo;
        System.out.println("Igrese el tipo de trabajador");
        Scanner teclado =new Scanner(System.in);
        tipodetrabajador= teclado.nextInt();
            teclado.close();
        switch (tipodetrabajador){
            case 1:
                ocupacion="repositor";
                
                break;
            case 2:
                ocupacion="cajero";
                break;
            case 3:
                ocupacion="supervisor";
                break;
        
            default:
                ocupacion="0";
                break;
            
        }
        if (ocupacion=="repositor") {    
            sueldo=15890.0+(15890.0*0.10);
            System.out.println("El sueldo es: "+ sueldo);      
        }
        if (ocupacion=="cajero") {
            sueldo=25630.89;
            System.out.println("El sueldo es: "+ sueldo);

        }
        if (ocupacion=="supervisor") {
            sueldo=35560.20-(35560.20*0.11);
            System.out.println("El sueldo es: "+ sueldo);
        }
        else{
            System.err.println("Introduccion invalida");
        }
    }
}
