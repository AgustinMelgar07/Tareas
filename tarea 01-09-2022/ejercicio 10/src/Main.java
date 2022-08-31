import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in);
        int ingreseNumero;
        int numeroAleatorio =(int)(Math.random()*100+1);
        System.out.println("ingrese un numero");
        ingreseNumero=s.nextInt();
        while (numeroAleatorio!=ingreseNumero){
            if (ingreseNumero<numeroAleatorio){
                System.out.println("debe ingresar un numero mas grande");
            } else {
                System.out.println("debe ingresar un numero mas chico");
            }
            System.out.println("ingrese otro numero");
            ingreseNumero=s.nextInt();
        }
        System.out.println("Correcto! "+ingreseNumero+"="+numeroAleatorio);
    }
}
