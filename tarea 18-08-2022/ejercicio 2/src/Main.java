public class Main {

    public static void main(String[] args) {
	// write your code here
        float n1 = (float) 6 / 5;
        float n2 = (float) 2 / 3;
        float n3 = (float) 7 / 2;
        float n4 = (float) 2 / 30;
        float n5 = (float) 1 / 3;
        float n6 = (float) n5 / 5;

        float total=(float) (n1-(n2*n3)+n4)/n6;
        System.out.println("\n\n La operacion combinada: \n (6/5-2/3*7/2+2/30)/(1/3 /5)  =  "+total);
    }
}
