import java.util.Scanner;
class plus_or_minus{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>0){
			System.out.print("number is positive");
		}
		else if(n==0){
			System.out.print("number is 0");
		}
		else{
			System.out.print("number is negative");
		}
	}
}