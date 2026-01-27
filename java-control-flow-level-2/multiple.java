import java.util.Scanner;
class multiple{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		if(n>0 && n<100){
			for(int i=100;i>=1;i--){
				if(n%i==0){
					System.out.print(i + " ");
				}
			}
		}
	}
}