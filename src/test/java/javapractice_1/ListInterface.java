package javapractice_1;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num = new ArrayList<Integer>(); //Child class object
		//Interface
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(5);
		num.add(7);
		num.add(10);
		
		for (Integer I : num) {
			System.out.println(I);
		}
		
	}

}


