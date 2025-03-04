package teoria.Vectores;
import java.util.Scanner;
public class vectores {
    public static void main(String[] args) {
        //Declaracion unidimencionales
        int vector []=new int [4];
        vector[0]=2;
        vector[1]=4;
        vector[2]=3;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese el valor para el indice:"+i);
            vector[i]=teclado.nextInt();
        }
        
        //recorrido
        for (int i=0; i<vector.length;i++){
            System.out.println("estoy en el indioce: "+i);
            System.out.println("tengo guardado un: "+vector[i]);
            System.out.println("-----------------------------");
        }
        teclado.close();
    }
}
