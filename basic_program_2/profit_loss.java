import java.util.Scanner;
public class profitloss {

    public static void main(String[] args){
        System.out.println("Enter CostPrice And SellingPrice : ");
        Scanner input = new Scanner(System.in);
        int cp = input.nextInt();
        int sp = input.nextInt();
        int profit = sp - cp;
        double pro_per = (profit / cp)*100;
        input.close();
        System.out.println("Profit : "+profit);
        System.out.println("Profit_Percentage : "+pro_per);
    }
}