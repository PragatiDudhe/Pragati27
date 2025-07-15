package javapractice_1;

import java.util.ArrayList;

public class ArreyListClassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> num = new ArrayList<Integer>();

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
		
		ArrayList<Character> ch = new ArrayList<Character>();
		
		ch.add('p');
		ch.add('D');
		ch.add(null);
		ch.add('p');
		
		for (Character a : ch ) {
			System.out.println(a);
		}
		
	}

}
