import java.util.Scanner;
class power{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pow = in.nextInt();
		int result = 1;
		if(n>0 && pow>0){
			for(int i=1;i<=pow;i++){
				result*=n;
			}
		}
		System.out.print(result);
	}
}