import java.util.Scanner;

class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] salary = new int[10];
        int[] years = new int[10];
        int[] bonus = new int[10];
        int[] newSalary = new int[10];

        int totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextInt();

            System.out.print("Enter Years of Service: ");
            years[i] = sc.nextInt();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = salary[i] * 5 / 100;   // 5%
            else
                bonus[i] = salary[i] * 2 / 100;   // 2%

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
