import java.util.Scanner;

class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int total = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num <= 0 || index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Total = " + total);
    }
}
