package javapractice_1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method - 1 Put Method
				LinkedHashMap <Integer, String> StudentDetails = new LinkedHashMap <Integer, String> ();
				StudentDetails.put(1, "Pragati");
				StudentDetails.put(3, "Vaishnavi");
				StudentDetails.put(4, "Santoshi");
				StudentDetails.put(2, "Pragati");
				StudentDetails.put(5, "Amit");
				System.out.println(StudentDetails);
				System.out.println("-----------------------------------");
				
			//Method 2 - Put all
				LinkedHashMap <Integer, String> StudentD = new LinkedHashMap <Integer, String> ();
				StudentD.put(7, "Kiran");
				StudentD.put(9, "Pratik");
				StudentD.put(8, "Prajwal");
				StudentD.put(6, "Krishna");
				StudentDetails.putAll(StudentD);
				
				Set<Entry<Integer, String>> A = StudentDetails.entrySet();

				for (Entry<Integer, String> B : A) {
				    System.out.println(B.getKey() + " : " + B.getValue());
				}System.out.println("-----------------------------------");
				
			//Method 3 - Clear 
				//StudentDetails.clear();
				A = StudentDetails.entrySet();
				for (Entry<Integer, String> B : A) {
				    System.out.println(B.getKey() + " : " + B.getValue());
				}System.out.println("-----------------------------------");
				
			// Method 4 - Contain Key
				System.out.println("Key 9 Contain = " + StudentDetails.containsKey(9) );
				System.out.println("Key 15 Contain = " + StudentDetails.containsKey(15) );
				System.out.println("-----------------------------------");
				
			// Method 5 - Contain Value
				System.out.println("Value Pragati Contain =  " + StudentDetails.containsValue("Pragati") );
				System.out.println("Value Ramesh Contain = " + StudentDetails.containsValue("Ramesh") );
				System.out.println("-----------------------------------");
				
			//Method 6 - Get Method 
				System.out.println(StudentDetails.get(5));
				System.out.println("-----------------------------------");
				
			//Method 7 - is empty 
				System.out.println(StudentDetails.isEmpty());
				//StudentDetails.clear();
				System.out.println(StudentDetails.isEmpty());
				System.out.println("-----------------------------------");
				
			// Method 8 - Key Set 
				Set<Integer>Keys = StudentDetails.keySet();
				for (Integer i : Keys) {
					System.out.println(i);
				}System.out.println("-----------------------------------");
				
			// Method 9 - Remove
				StudentDetails.remove(9);
				A = StudentDetails.entrySet();
				for (Entry<Integer, String> B : A) {
				    System.out.println(B.getKey() + " : " + B.getValue());
				}System.out.println("-----------------------------------");
				
			// Method 10 - Replace
				StudentDetails.replace(6, "Rani");
				A = StudentDetails.entrySet();
				for (Entry<Integer, String> B : A) {
				    System.out.println(B.getKey() + " : " + B.getValue());
				}System.out.println("-----------------------------------");
				
			// Method 11 - Size 
				System.out.println(StudentDetails.size());
				System.out.println("-----------------------------------");
				
			// Method 12 - Value
				Collection <String> Values = StudentDetails.values();
				for (String S : Values) {
					System.out.println(S);
				}System.out.println("-----------------------------------");
				
			//Method 13 - Iterator
				Set<Entry<Integer, String>> E  = StudentDetails.entrySet();
				Iterator<Entry<Integer, String>>It = E.iterator();
				while (It.hasNext()) {
					Entry <Integer, String> F = It.next();
					System.out.println(F.getKey() + " : " + F.getValue() );
				
				


	}

	}
}