package jpjpkj;

public class Reversestring {

	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}