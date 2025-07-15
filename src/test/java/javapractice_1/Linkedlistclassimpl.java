package javapractice_1;

import java.util.LinkedList;


public class Linkedlistclassimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> num = new LinkedList<Integer>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(5);
		num.add(7);
		num.add(10);
		num.add(null);

		for (Integer n : num) {
			System.out.println(n);
		}
		
		System.out.println(num.get(4));

	}

}


	


