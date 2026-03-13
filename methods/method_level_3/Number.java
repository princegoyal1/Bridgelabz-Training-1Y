import java.util.Scanner;

public class Number {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';

        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {

        int sum = 0;
        int power = digits.length;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Digits count = " + countDigits(num));
        System.out.println("Duck Number = " + isDuck(digits));
        System.out.println("Armstrong = " + isArmstrong(num, digits));
    }
}