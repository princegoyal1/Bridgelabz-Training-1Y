import java.util.Scanner;
public class InputAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First No. ");
        int num = sc.nextInt();

        System.out.println("Enter Your Second No. ");
        int num2 = sc.nextInt();

        int c = num + num2;
        System.out.println("Sum is " +c );
    }
}
