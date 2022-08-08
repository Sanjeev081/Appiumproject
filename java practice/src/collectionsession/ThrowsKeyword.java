package collectionsession;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obje=new ThrowsKeyword();
		obje.sum();
		System.out.println("ABC");
		
		
		

	}
	public void sum() {
		try {
			div();
		}catch(ArithmeticException e) {
			
		}
		
		
	}
	public void div() throws ArithmeticException{
		int i=9/0;
	}

}
