package javapractice_1;


import java.util.LinkedHashSet;

public class LinkedHashSetClassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> panNumers = new LinkedHashSet<Integer>();

		panNumers.add(1);
		panNumers.add(2);
		panNumers.add(5);
		panNumers.add(1);
		panNumers.add(4);
		panNumers.add(null);

		for (Integer i : panNumers) {
			System.out.println(i);
		}



	}

}
