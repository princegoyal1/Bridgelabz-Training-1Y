import java.util.Scanner;
class fizzbuzz{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num>0){
		for(int i=1;i<=num;i++){
		if(num%3==0 && num%5==0){
					System.out.println("fizzbuzz");
				}
		else if(num%3==0){
					System.out.println("fizz");
				}	
		else if(num%5==0){
			        System.out.println("buzz");
				}
		else{
					System.out.println(i);
				}
			}
		}
	}
}