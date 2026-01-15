import java.util.Scanner;

public class HeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        int heightCm = sc.nextInt();

        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        int totalInches = (int)(heightCm / cmPerInch);

        int feet = totalInches / inchesPerFoot;
        int inches = totalInches % inchesPerFoot;

        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

    }
}