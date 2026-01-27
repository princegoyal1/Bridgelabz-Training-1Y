import java.util.Scanner;
class fact{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int fact=1;
			int i=1;
		if(n>0){	
			while(i!=n+1){
				fact*=i;
				i++;
			}
		}
		System.out.print(fact);
	}
}