import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        int cm = sc.nextInt();
        int totalInches = cm / 3;
        int feet = totalInches / 12;
        int inches = totalInches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}