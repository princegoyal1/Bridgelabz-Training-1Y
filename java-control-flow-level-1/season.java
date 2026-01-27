import java.util.Scanner;
class season{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int mon = in.nextInt();
		int day = in.nextInt();
		if(mon==3){
			if(day>=20 && day<=31){
				System.out.print("spring season");
			}
		}
	    else if(mon==6){
            if(day>=0 && day<=20){
				System.out.print("spring season");
			}	    
		}
		else if(mon>3 && mon<6){
			System.out.print("spring season");
		}
		else{
			System.out.print("no spring season");
		}
	}
}