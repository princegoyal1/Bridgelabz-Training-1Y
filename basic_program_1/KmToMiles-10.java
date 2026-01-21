import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int km = sc.nextInt();
        float miles = km * 0.621f;
        System.out.println("Distance in miles = " + miles);
    }
}