import java.util.Scanner;

class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        int total = unitPrice * quantity;
        System.out.println("total purchase price is " + total + " if the quantity " + quantity + " and unit price is " + unitPrice);
    }
}