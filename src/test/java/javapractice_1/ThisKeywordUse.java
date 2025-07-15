package javapractice_1;

	public class ThisKeywordUse {
		
		int mobno;//instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	
		ThisKeywordUse TK = new ThisKeywordUse();
		System.out.println(TK.hashCode());
		TK.look();
		TK.contact(955826485);
	}
	
	//This keyword along with two method
	public void look () {
		System.out.println("This is look");
		System.out.println(this.hashCode());
		this.print();
	}
	public void print () {
		System.out.println("This is print");
	}
	
	//Instance and local variable with same name 
	
	public void contact (int mobno) {//local variable
		this.mobno = mobno;
		System.out.println("Mob NO. = " +this.mobno );
	}
	
	//Constructer
	
	public ThisKeywordUse() {
		this(10);
		System.out.println("This is default");
	}
	public ThisKeywordUse(int sallery){
		this("Pragati", 2500.56f);
		System.out.println("Single parameterised Constructer ");
	}
	public ThisKeywordUse(String name, float balance) {
		System.out.println("Two parameterised Constructer");
	}
}
