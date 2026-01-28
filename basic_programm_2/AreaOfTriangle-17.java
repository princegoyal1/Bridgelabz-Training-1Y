import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        int base = sc.nextInt();
        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();

        int areaCm = (base * height) / 2;
        float areaInches = areaCm / (2.54f * 2.54f);

        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}