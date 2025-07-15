package javapractice_1;

import java.util.TreeSet;

public class TreeSetClassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> panNumers = new TreeSet<Integer>();

		panNumers.add(1);
		panNumers.add(2);
		panNumers.add(5);
		panNumers.add(1);
		panNumers.add(4);
		//panNumers.add(null);

		for (Integer i : panNumers) {
			System.out.println(i);
		}



	}

}
