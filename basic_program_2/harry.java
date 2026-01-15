import java.util.Scanner;
class Harry
{
		
		public static void main(String args[])
		{
			int a =188;
			int b =99;
			int sum= a+b;
		System.out.println("Enter DOB :");
		Scanner input = new Scanner(System.in);
		int birth_year = input.nextInt();
		int current_year=2026;
		int age=current_year-birth_year;
		System.out.println("age oh harry :"+age);
		
		}
		
}