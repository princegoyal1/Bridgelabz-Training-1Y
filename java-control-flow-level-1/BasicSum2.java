import java.util.Scanner;
class BasicSum{
	public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			while(true){
				float a = in.nextFloat();
				float b = in.nextFloat();
				if(a==0 || b==0 || a<=0 || b<=0){
					break;
				}
				double ans = a + b;
				System.out.println(ans);
		}
	}
}