import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);

        int numero=Integer.parseInt((JOptionPane.showInputDialog("ingrese un valor")));
        double resultado= Math.sqrt(numero);

        JOptionPane.showMessageDialog(null,"La raiz de "+numero+" es igual a "+ resultado);
    }
}
