interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    protected String number;
    protected double rate;

    public Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    abstract double calculateRentalCost(int days);
}

// Car
class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, rate);
    }

    double calculateRentalCost(int days) {
        return days * rate;
    }

    public double calculateInsurance() {
        return 500;
    }
}

// Main
class Main3 {
    public static void main(String[] args) {
        Vehicle v = new Car("UP32AB1234", 1000);

        System.out.println("Rent: " + v.calculateRentalCost(5));
    }
}