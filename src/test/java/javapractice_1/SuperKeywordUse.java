package javapractice_1;

//super keyword used to call parent class method in child class method

class Vehical {
	//instance member variable
	String colour = "Black";
	//instance member function
	public void InformationV () {
		System.out.println("Vehical Method");
	}
}
class Car extends Vehical{
	//instance member variable
	String carcolour = "Black";
	//instance member function
	public void InformationC () {
		super.InformationV(); //parent class method
		System.out.println("Car Method");
	}
}
public class SuperKeywordUse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car C1 = new Car();
		C1.InformationC();
		C1.InformationV();
		
	}

}
