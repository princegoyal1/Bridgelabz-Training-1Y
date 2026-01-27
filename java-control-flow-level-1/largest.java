import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		if(a>b && a>c){
			System.out.print("first is largest");
		}
		else if(b>a && b>c){
			System.out.print("second is largest");
		}
		else if(c>a && c>b){
			System.out.print("third is largest");
		}
	}
}