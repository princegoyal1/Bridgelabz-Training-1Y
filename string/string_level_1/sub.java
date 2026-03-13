
import java.util.Scanner;
class substr{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        substr m = new substr();
        System.out.println(m.sub(a, start, end));

    }
    public boolean sub(String a,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=a.charAt(i);
        }
        if(result.equals(a.substring(start,end))){
            return true;
        }
            return false;
    }
}
