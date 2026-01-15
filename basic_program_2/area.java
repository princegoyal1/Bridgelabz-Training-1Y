import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("base: ");
        int baseCm = sc.nextInt();

        System.out.print("height: ");
        int heightCm = sc.nextInt();

        int areaSqCm = (baseCm * heightCm) / 2;

        int areaSqIn = areaSqCm / 6;

        System.out.println("Area" + areaSqCm +
                           " and in sq in is " + areaSqIn);

    }
}