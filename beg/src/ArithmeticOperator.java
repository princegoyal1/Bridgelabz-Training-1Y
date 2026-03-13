import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;


        System.out.println( "Add is :- "+c);
        System.out.println("Sub is :-" +d);
        System.out.println("mul is :- "+e);
        System.out.println("Div is :- "+f);
        System.out.println("mod is :- "+g);

    }

}
