import java.util.Scanner;
class bonus{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int salary = in.nextInt();
		int year = in.nextInt();
        double bonus = (0.05*salary);
			if(year > 5 && year <= 200){
				System.out.print("bonus is " + bonus);
			}
			else{
				System.out.print("no bonus");
			}
	}
	
}