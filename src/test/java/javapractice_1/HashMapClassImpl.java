package javapractice_1;


import java.util.HashMap;

public class HashMapClassImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		HashMap<Integer, String> StudentD = new HashMap<Integer, String>();

		StudentD.put(1, "Pragati");
		StudentD.put(2, "Hardik");
		StudentD.put(3, "Amit");
		StudentD.put(5, "Ravindra");
		StudentD.put(8, "Radha");
		StudentD.put(null, "Tiger");
		StudentD.put(6, null);
		StudentD.put(7, null);
		
		System.out.println(StudentD);



	}

}
