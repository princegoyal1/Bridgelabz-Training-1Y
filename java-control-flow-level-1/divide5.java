import java.util.Scanner;
class divisible_by_5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("number is ");
		int num = in.nextInt();
		if(num%5==0){
				System.out.print("number is divisible by 5");
		}
		else{
				System.out.print("number is not divisible ");
		}
	}
}