package javapractice_1;

// Super keyword used to call parent class constructer explicitely
class parent {
	
	public parent() {
		System.out.println("This is default");
	}
	public parent (int age) {
		System.out.println("single parameter");
	}
	public parent (String name, float balance) {
		System.out.println("Two parameter");
	}
}
class child extends parent {
	public child (){
		super ("Pragati", 250.56f);
	}
}

public class SuperKeywordUse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child ();
	}
}
