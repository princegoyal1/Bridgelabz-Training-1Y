import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int size = 10, index = 0;
        int[] factors = new int[size];

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == size) {
                    size *= 2;
                }
                factors[index++] = i;
            }
        }

        for (int i = 0; i < index; i++)
            System.out.print(factors[i] + " ");
    }
}
