import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        float pi = 3.14f;
        float volume = pi * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}