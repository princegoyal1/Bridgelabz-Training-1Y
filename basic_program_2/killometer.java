import java.util.Scanner;
public class killometer {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        System.out.println("Enter KiloMeter : ");
        Scanner input = new Scanner(System.in);
        float km = input.nextInt();
        float miles = km / 1.6f;
        System.out.println("Km To Miles : "+miles);
        input.close();
    }

}