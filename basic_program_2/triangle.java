import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("base (in inches): ");
        int base = sc.nextInt();

        System.out.print("height(in inches): ");
        int height = sc.nextInt();

        int area = (base * height) / 2;

        int areaincm = area * 6;

        System.out.println("Base = " + base + " inches, Height = " + height + " inches");
        System.out.println("Area of Triangle in square inches = " + area);
        System.out.println("Area of Triangle in square centimeters = " + areaincm);

    }
}