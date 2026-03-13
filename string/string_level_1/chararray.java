import java.util.Scanner;
class chararray{
	public boolean compare(String a){
		char[] arr = new char[a.length()];
		char[] arr1 = a.toCharArray();
		for(int i=0;i<a.length();i++){
			arr[i] = a.charAt(i);
		}
		if(arr.length!=arr1.length){
			return false;
		}
		else{
			for(int i=0;i<a.length();i++){
				if(arr[i] != arr1[i]){
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		chararray c = new chararray();
		System.out.println(c.compare(a));
	}
}