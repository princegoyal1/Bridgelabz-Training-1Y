import java.util.Scanner;
class natural_sum{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int sum=0;
			int sum2=n*(n+1)/2;
			int i=0;
		if(n>0){	
			while(i!=n+1){
				sum+=i;
				i++;
			}
		}
		if(sum == sum2){
			System.out.print(sum);
		}
	}
}