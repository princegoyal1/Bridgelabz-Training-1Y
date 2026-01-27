 import java.util.Scanner;
class greatest_factor{
	public static void main(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int greatestfactor=0;
		int i=n-1;
		while(i!=0){
			if(n%i==0){
				greatestfactor = i;
				break;
			}
			i--;
		}
		System.out.print("greatest factor is " + greatestfactor);
	}
}