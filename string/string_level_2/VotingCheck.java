import java.util.Scanner;

public class VotingCheck {

    public static String[][] checkVote(int age[]){

        String arr[][]=new String[age.length][2];

        for(int i=0;i<age.length;i++){

            arr[i][0]=String.valueOf(age[i]);

            if(age[i]>=18)
            arr[i][1]="true";
            else
            arr[i][1]="false";
        }

        return arr;
    }

    public static void display(String arr[][]){

        System.out.println("Age\tCan Vote");

        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i][0]+"\t"+arr[i][1]);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int age[]=new int[10];

        for(int i=0;i<10;i++){
            System.out.print("Enter age of student "+(i+1)+": ");
            age[i]=sc.nextInt();
        }

        String result[][]=checkVote(age);

        display(result);
    }
}