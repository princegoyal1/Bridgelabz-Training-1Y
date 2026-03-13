class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    void calculateCost() {

        int costPerDay = 2000;
        int totalCost = rentalDays * costPerDay;

        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        CarRental r = new CarRental("Ravi", "Toyota", 3);
        r.calculateCost();
    }
}