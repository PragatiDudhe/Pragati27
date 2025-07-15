package javapractice_1;
//Super keyword to differentiate bet two class instance member variable with same name

class Twowheeler {
	//instance member variable
	String colour = "Black";
	int price = 600000;
	//instance member function
	public void InformationT () {
		System.out.println("Twowheeler Method");
	}
}
class Bike extends Twowheeler{
	//instance member variable
	int price = 500000;
	//instance member function
	public void InformationB () {
		super.InformationT();
		System.out.println("Bike method");
		System.out.println(super.price); //instance
		System.out.println(price); //local
	}
}
public class SuperKeywordUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike B = new Bike ();
		B.InformationB();
	}
	}
