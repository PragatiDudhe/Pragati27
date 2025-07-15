package javapractice_1;

public class WrapperClass {
	
	public void Integerwrapperclass () {
		Integer a = 10;
		Integer b = 20;
		Integer result = a+b;
		
		int c = a.intValue();//Unboxing
		// coversion from wrapper to primitive is called unboxing
		
		Integer d = Integer.valueOf(c);//Autoboxing
		// Conversion from primitive to wrapper is called Autoboxing
				
		System.out.println(result);
	}
	public void CharacterWrapperClass() {
		Character C = 'P';
		Character D = 'A';
		
		char ch = C.charValue(); //Unboxing
		Character CH1 = Character.valueOf(ch);//Autoboxing
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass w = new WrapperClass();
		w.Integerwrapperclass();
	}

}
