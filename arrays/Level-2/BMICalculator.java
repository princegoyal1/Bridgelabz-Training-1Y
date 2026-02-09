import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        float[] height = new float[n];   
        float[] weight = new float[n];   
        float[] bmi = new float[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Height (in meters): ");
            height[i] = sc.nextFloat();

            System.out.print("Enter Weight (in kg): ");
            weight[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4f)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9f)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9f)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\n BMI Report ");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
    }
}
