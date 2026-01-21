public class fees {
    public static void main(String[] args) {
        
        double courseFee = 125000;
        double discountPercent = 10;       
        double discountAmount = (courseFee * discountPercent) / 100;       
        double finalPrice = courseFee - discountAmount;

        System.out.println("Original Course Fee: INR " + courseFee);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: INR " + discountAmount);
        System.out.println("Final Price after Discount: INR " + finalPrice);
    }
}