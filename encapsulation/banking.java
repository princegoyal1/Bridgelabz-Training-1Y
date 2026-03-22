// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Encapsulation (getter)
    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Abstract
    abstract double calculateInterest();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.05;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

// Current Account
class CurrentAccount extends BankAccount {
    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.02;
    }
}

// Main
class Main4 {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(1, "Aman", 20000);
        BankAccount acc2 = new CurrentAccount(2, "Riya", 15000);

        System.out.println("Interest: " + acc1.calculateInterest());
        System.out.println("Interest: " + acc2.calculateInterest());
    }
}