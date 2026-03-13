import java.util.Scanner;
public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("principle");
        float p = sc.nextFloat();

        System.out.println("rate");
        float r = sc.nextFloat();

        System.out.println("time" );
        float t = sc.nextFloat();

        float si =(p*r*t)/100;

        System.out.println("principle is :- "+p);
        System.out.println("Rate is " +r);
        System.out.println("time is :- " +t);
        System.out.println("SI is :- " +si);



    }
}
