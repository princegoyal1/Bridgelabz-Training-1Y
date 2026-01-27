import java.util.Scanner;
class fact2{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int fact=1;
			int i=1;
		if(n>0){	
			for(;i<=n;i++){
				fact*=i;
			}
		}
		System.out.print(fact);
	}
}