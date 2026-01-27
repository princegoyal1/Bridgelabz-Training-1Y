import java.util.Scanner;
class mul{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num>=6 && num<=9){
			for(int i=1;i<=10;i++){
				System.out.println(num + "x" + i + "=" + (num*i));
			}
		}
	}
}