import java.util.Scanner;
class greatest_factor{
	public static void main(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int greatest_factor=0;
		int i=n-1;
		for(;i>=1;i--){
			if(n%i==0){
				greatest_factor = i;
				break;
			}
		}
		System.out.print("greatest factor is " + greatest_factor);
	}
}