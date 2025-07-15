package javapractice_1;

public class FinalKeyWordwithVariable {
	
	// instance member variable
	int mobno = 955220945;
	
	//final instance member variable
	final long aadharno = 956825653256L;
	
	//Static variable  
	static String CompanyName = "wipro"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		
		public void testFinalVariable(int a , int b) {
			
			 mobno = 955247852;
			// aadharno = 658974123654L;
			 //getting complile time erroe coz final variable can not be reasigned
			
			//Local Variable
			int calResult = a/b;
		
		
	}

}
