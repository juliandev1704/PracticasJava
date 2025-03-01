package ejercicios;

public class cambiodevariables {
    public static void main(String[] args) {
        int n1, n2,aux;
        n1=1;
        n2=2;
        aux=n2;
        n2=n1;
        n1=aux;
        System.out.println(n1);
        System.out.println(n2);
    }


}
