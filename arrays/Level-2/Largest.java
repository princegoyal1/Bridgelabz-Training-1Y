import java.util.Arrays;
import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int max = 10;
        int[] digits = new int[max];
        int index = 0;

        while (number != 0) {
            if (index == max) {
                max += 10;
                digits = Arrays.copyOf(digits, max);
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
