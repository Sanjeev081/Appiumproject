package collectionsession;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		System.out.println("ABC");
		
		try {
			throw new Exception("Naveen Exception");

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	
		
		
		System.out.println("pqr");
		String Exec_Flag="N";
		if(Exec_Flag.equals("N")) {
			throw new Exception("Exc flag is No Exception");
			
		}

	}

}
