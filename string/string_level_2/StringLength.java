import java.util.Scanner;

public class StringLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) { 
                str.charAt(count);
                count++;           
            }
        } 
        catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();  

        int myLength = findLength(text);    
        int realLength = text.length();     

        System.out.println("Length using our method = " + myLength);
        System.out.println("Length using length() method = " + realLength);
    }
}