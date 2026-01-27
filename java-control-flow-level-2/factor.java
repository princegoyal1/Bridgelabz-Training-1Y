import java.util.Scanner;
class factor{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print("factors of n is: ");
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i + " ");
			}
		}
	}
}