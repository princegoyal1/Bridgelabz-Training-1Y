import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        float weight = sc.nextFloat();

        System.out.print("Enter height in cm: ");
        float heightCm = sc.nextFloat();

        float heightMeter = heightCm / 100;

        float bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4f) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9f) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9f) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

    }
}
