import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in);
        System.out.println("ingrese un numero que desea averiguar diversos datos");
        double numero=(double) s.nextDouble();
        System.out.println("ingrese otro valor para averiguar junto al anterior numero el arco tangente entre -PI y PI");
        double numero2=(double) s.nextDouble();

        double pi =(double)Math.PI;
        double E =(double)Math.E;
        double exp =(double) Math.exp(numero);
        double log =(double) Math.log(numero);
        double sin =(double) Math.sin(numero);
        double cos =(double) Math.cos(numero);
        double tan =(double) Math.tan(numero);
        double atan =(double) Math.atan(numero);
        double atan2 =(double) Math.atan2(numero,numero2);
        System.out.println("el numero pi es: "+pi+"\n");
        System.out.println("el numero E es: "+E+"\n");
        System.out.println("el exponencial de "+numero+" es: "+exp+"\n");
        System.out.println("el logaritmo de "+numero+" es: "+log+"\n");
        System.out.println("el seno de "+numero+" es: "+sin+"\n");
        System.out.println("el coseno de "+numero+" es: "+cos+"\n");
        System.out.println("la tangente de "+numero+" es: "+tan+"\n");
        System.out.println("el arco tangente entre -PI/2 y PI/2 de "+numero+" es: "+atan+"\n");
        System.out.println("el arco tangente entre -PI y PI de "+numero+"y"+numero2+" es: "+atan2+"\n");


    }
}