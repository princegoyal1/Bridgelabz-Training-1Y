import java.util.Scanner;
class smallest_check{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if(a<b){
			if(a<c){
				System.out.print("yes,first number is smallest");
			}
		}
		
	}
}