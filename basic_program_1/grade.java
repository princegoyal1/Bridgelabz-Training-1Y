import java.util.scanner;
class ConditionStatement{
	public static void main(String args[]){
		scanner input = new Scanner(System.in);
		for(int i= 1;i<=10; i++){
			int marks = input.nextInt();
			if(marks<50){
				System.out.println("Fail");
			}
			else if(marks>=50 && marks<60){
				System.out.println("D Grade");
			}
			else if(marks>=60 && marks<70){
				System.out.println("C Grade");
			}
			else if(marks>=70 && marks<80){
				System.out.println("B Grade");
			}
			else if(marks>=80 && marks<90){
				System.out.println("A Grade");
			}
			else{
				System.out.println("O Grade");
			}
		}
	}
}
				
