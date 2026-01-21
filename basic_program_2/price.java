import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price (INR): ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        int totalPrice = unitPrice * quantity;

        System.out.println("price is INR " + totalPrice +   "  quantity is " + quantity +"price unit" + unitPrice);

        sc.close();
    }
}