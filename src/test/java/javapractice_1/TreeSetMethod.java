package javapractice_1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
TreeSet <Integer> P = new TreeSet <Integer>();
		
		//Method 1 - Append the specified element to the end of the list
			P.add(10);
			P.add(20);
			P.add(30);
			for (Integer n : P) {
			System.out.println(n);
			}System.out.println("-----------------------------------");
			
		//Method 2 - Overloading of add,Inserts the specified element at the specified position in thislist.
			//P.add(2, 25);
			for (Integer i : P) {
			System.out.println(i);
			}System.out.println("-----------------------------------");
			
		//Method 3 - Add all , Appends all of the elements in the specified collection to the end ofthis list
			TreeSet <Integer> D = new TreeSet <Integer>();
			D.add(40);
			D.add(50);
			P.addAll(D);
			for (Integer i : P) {
			System.out.println(i);
			}System.out.println("-----------------------------------");

		// Method 4 - Clear all element, Removes all of the elements from this list
			//P.clear();
			for (Integer i : P ) {
			System.out.println(i);
			}System.out.println("-----------------------------------");
		
		// Method 5 - Contains Method , Returns true if this list contains the specified element. 
			P.contains(25);
			P.contains(35);
			System.out.println("Contains element 25 = " + P.contains(25));
			System.out.println("Contains element 35 = " + P.contains(35));
			System.out.println("-----------------------------------");
			
		// Method 6 - Contain All method, Returns true if this collection contains all of the elementsin the specified collection.
			P.containsAll(D);
			System.out.println("P contains element D = " + P.containsAll(D));
			System.out.println("-----------------------------------");
			
		//Method 7 - Get Method ,Returns the element at the specified position in this list.
			//P.get(3);
			//System.out.println(P.get(3));
			System.out.println("-----------------------------------");
			
		//Method 8 - Index off, Returns the index of the first occurrence of the specified elementin this list, 
			//P.indexOf(30);
			//System.out.println("The index of element 30 is = " + P.indexOf(30));
			System.out.println("-----------------------------------");
			
		// Method 9 - isEmpty, Returns true if this list contains no elements.
			P.isEmpty();
			System.out.println(P.isEmpty());
			//P.clear();
			System.out.println(P.isEmpty());
			System.out.println("-----------------------------------");
			
		// Method 10 - to Array, Returns an array containing all of the elements in this listin proper sequence (from first to last element). 
			Object [] a = P.toArray();	
			for (Object o : a ) {
				System.out.println(o);
			}System.out.println("-----------------------------------");
			
		//Method 11 - Size (no of element),Returns the number of elements in this list.
			System.out.println(P.size());
			System.out.println("-----------------------------------");
			
			
		//Method 13 - Remove, Removes the element at the specified position in this list.
			P.remove(5);
			for (Integer t : P) {
			System.out.println(t);
			}System.out.println("-----------------------------------");
			
		// Method 14 - Iterator
			Iterator <Integer> I = P.iterator();
			while (I.hasNext()) {
				System.out.println(I.next());
			}System.out.println("-----------------------------------");
			
		


	}

}
