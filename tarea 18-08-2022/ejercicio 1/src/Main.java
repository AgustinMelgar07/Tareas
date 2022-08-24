import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre=s.nextLine();
        System.out.println("ingrese edad");
        int edad=s.nextInt();
        System.out.println("ingrese salario");
        double salario =s.nextDouble();
        boolean carnet= true;
        System.out.println("el nombre de la persona es: "+nombre);
        System.out.println("la edad de la persona es: "+edad);
        System.out.println("el salario de la persona es: "+salario);
        System.out.println("valor logico"+carnet);

    }
}
