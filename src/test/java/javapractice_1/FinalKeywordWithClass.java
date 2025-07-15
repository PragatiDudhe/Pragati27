package javapractice_1;

public class FinalKeywordWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//We can not create a child class of that class which is declare as a final 
	
	final class A{
		void print () {
			System.out.println("This is print");
		}
	}
	
	/*class B extends A{
		void show () {
			System.out.println("This is show");
		}
	}*/
}