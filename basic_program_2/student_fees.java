import java.util.Scanner;

public class StudentFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Fee: ");
        int fee = sc.nextInt();
		
        System.out.print(" Discount Percentage: ");
        int discountPercent = sc.nextInt();

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.println("Discount Amount: " + discount);
        System.out.println("after Discount: " + finalFee);

       
    }
}