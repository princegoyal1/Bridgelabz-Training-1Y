import java.util.Scanner;
class counter2{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int i=n;
			if(n>0){
				for(;i!=0;i--){
					System.out.print(i + " ");
				}
		}
	}
}