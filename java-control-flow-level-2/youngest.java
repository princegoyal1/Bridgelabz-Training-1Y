import java.util.Scanner;
class youngest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age_amar = in.nextInt();
		int age_akbar = in.nextInt();
		int age_anth = in.nextInt();
		if(age_amar<age_akbar){
			if(age_amar<age_anth){
				System.out.println("youngest is amar");
			}
		}
        else if(age_akbar<age_anth){
			if(age_akbar<age_amar){
				System.out.println("youngest is akbar");
			}
		}			
		else if(age_anth<age_akbar){
			if(age_anth<age_amar){
				System.out.println("youngest is anthony");
			}
		}	
		float hei_amar = in.nextFloat();
		float hei_akbar = in.nextFloat();
		float hei_anth = in.nextFloat();
		if(hei_amar>hei_akbar){
			if(hei_amar>hei_anth){
				System.out.println("tallest is amar");
			}
		}
        else if(hei_akbar>hei_anth){
			if(hei_akbar>hei_amar){
				System.out.println("tallest is akbar");
			}
		}			
		else if(hei_anth>hei_akbar){
			if(hei_anth>hei_amar){
				System.out.println("tallest is anthony");
			}
		}	
	}
}