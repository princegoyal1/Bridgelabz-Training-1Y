import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int rate = sc.nextInt();
        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();
        int si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }
}