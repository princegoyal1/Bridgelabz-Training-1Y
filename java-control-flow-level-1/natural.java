import java.util.Scanner;
class natural{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int sum=0;
		int n = in.nextInt();
		if(n>0){
			for(int i=1;i<=n;i++){
				sum = sum + i;
			}
			System.out.print("yes the number is natural number and the sum is " + sum);
		}
	}
}