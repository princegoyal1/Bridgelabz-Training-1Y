import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        int InFeet = sc.nextInt();

        int InYards = distanceInFeet / 3;

        int InMiles = distanceInYards / 1760;

        System.out.println("Your distance in feet is " + InFeet + ", in yards is " + Yards + ", and in miles is " + Miles);

        sc.close();
    }
}