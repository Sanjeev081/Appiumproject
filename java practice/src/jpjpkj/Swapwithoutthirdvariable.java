package jpjpkj;

public class Swapwithoutthirdvariable {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		//1. with Using Third variable
		 //int t;
		 //t=x;//5
		// x=y;//10
		// y=t;//5
		 
		 //2.Without using Third variable+operator
		 x=x+y;//15
		 y=x-y;//5
		 x=x-y;//10
		 
		 System.out.println(x);
		 System.out.println(y);
		 

	}

}
