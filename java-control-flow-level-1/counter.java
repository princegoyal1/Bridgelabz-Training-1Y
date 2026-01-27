import java.util.Scanner;
class counter{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int i=n;
			if(n>0){
			while(i!=0){
				System.out.print(i + " ");
				i--;
			}
		}
	}
}