import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        int distanceInFeet = sc.nextInt();

        int feetPerYard = 3;
        int yardsPerMile = 1760;

        int distanceInYards = distanceInFeet / feetPerYard;

        int distanceInMiles = distanceInYards / yardsPerMile;

        System.out.println("The distance in feet is " + distanceInFeet +
                           ", in yards is " + distanceInYards +
                           ", and in miles is " + distanceInMiles);

    }
}