import java.util.Scanner;
class vote{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if(age>=18 && age<=150){
			System.out.print("person's age is " + age + "and can vote");
	}
	else{
		System.out.print("person's age is " + age + "and cannot vote");
	}
}