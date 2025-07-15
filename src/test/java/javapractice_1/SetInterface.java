package javapractice_1;

import java.util.HashSet;
import java.util.Set;


public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> panNumers = new HashSet<Integer>();

		panNumers.add(1);
		panNumers.add(2);
		panNumers.add(5);
		panNumers.add(1);
		panNumers.add(4);

		for (Integer i : panNumers) {
			System.out.println(i);
		}



	}

}
