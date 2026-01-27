import java.util.Scanner;
class odd_even{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>0){
			for(int i=0;i<=n;i++){
				if(i%2!=0){
					System.out.println(i + " is odd number");
				}
				else{
					System.out.println(i + " is even number");
				} 
			}
		}
	}
}