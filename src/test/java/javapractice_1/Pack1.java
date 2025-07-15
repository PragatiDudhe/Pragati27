package javapractice_1;


// by using import package.classname 
	//import javapractice_2.Pack2;
	//import javapractice_2.Pack3;


//By using import package*;
	//import javapractice_2.*;


public class Pack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by using import package.classname 
		/*Pack2 D2 =new Pack2();
		Pack3 D3 = new Pack3();
		D2.pack2calc();
		D2.pack3calc();
		D2.pack4calc();
		D3.Amit();
		D3.Pragati();*/
		
		
		//By using import package*;
		/*Pack2 D2 =new Pack2();
		Pack3 D3 = new Pack3();
		D2.pack2calc();
		D2.pack3calc();
		D2.pack4calc();
		D3.Amit();
		D3.Pragati();*/
	
		
		//By using fully qualified name
		javapractice_2.Pack2 P2 = new javapractice_2.Pack2();
		
		P2.pack2calc();
		P2.pack3calc();
		
		
		P2.pack4calc();
		
		
		
		javapractice_2.Pack3 PD = new javapractice_2.Pack3();
		PD.Pragati();
		PD.Pragati();
		PD.Amit();
		PD.Amit();

	}
	public void pack1calc() {
		System.out.println("Method from pack1");
	
	}

}
