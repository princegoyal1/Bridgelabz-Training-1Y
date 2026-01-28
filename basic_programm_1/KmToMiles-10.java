import java.util.Scanner;

public class AgeOfHarry {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }
} {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        int km = sc.nextInt();
        float miles = km * 0.621f;
        System.out.println("Distance in miles = " + miles);
    }
}