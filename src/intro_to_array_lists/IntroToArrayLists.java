package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> Integer = new ArrayList<String>();
		//2. Add five Strings to your list
		Integer.add("0");
		Integer.add("1");
		Integer.add("2");
		Integer.add("3");
		Integer.add("4");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < Integer.size(); i++) {
			System.out.println(Integer.get(i));

		}
			System.out.println(Integer.toString());
		
		//4. Print all the Strings using a for-each loop
		for (String string : Integer) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < Integer.size(); i++) {
			if (i%2==0) {
				
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = 0; i < Integer.size()-1; i++) {
			
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
