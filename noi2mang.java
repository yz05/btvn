package chip;

import java.util.ArrayList;

public class noi2mang {
	public static void main (String [] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List1:");
		for (Integer number : list) {
	         System.out.println("Number = " + number);
		}
	     ArrayList<Integer> list1 = new ArrayList<Integer>();
	 		list1.add(4);
	 		list1.add(5);
	 		list1.add(6);
	 		System.out.println("List2:");
	 		for (int number : list1) {
	 	         System.out.println("Number = " + number);
	 		}
	 	    list1.addAll(list);
	 	    System.out.println("List: ");
	 	   for (Integer number : list1) {
	 	         System.out.println("Number = " + number);
	      }
		}
	}



	

