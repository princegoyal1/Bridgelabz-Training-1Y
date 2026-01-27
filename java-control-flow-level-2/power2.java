import java.util.Scanner;
class power2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int pow = in.nextInt();
		int result = 1;
		int i=1;
		if(n>0 && pow>0){
			while(i!=pow+1){
				result*=n;
				i++;
			}
		}
		System.out.print(result);
	}
}