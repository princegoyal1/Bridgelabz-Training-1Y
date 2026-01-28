class DiscountedFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println("discount amount is " + discount + " final discounted fee is " + finalFee);
    }
}