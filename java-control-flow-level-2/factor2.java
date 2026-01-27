import java.util.Scanner;
class factor{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print("factors of n is: ");
		int i=1;
		while(i!=n+1){
			if(n%i==0){
				System.out.print(i + " ");
			}
			i++;
		}
	}
}