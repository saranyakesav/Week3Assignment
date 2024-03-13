package week3.HM1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionLsitInter {

	public static void main(String[] args) {
		//Declaring an arrayList
		
		List<Integer> arr1=new ArrayList<Integer>();
		List<Integer> arr2=new ArrayList<Integer>();
		
		//Adding elements to the arr1 & arr2
		
		arr1.add(3);arr1.add(2);	arr1.add(11);	arr1.add(4); arr1.add(6);	arr1.add(7);
		
		arr2.add(1);arr2.add(2);	arr2.add(8);	arr2.add(4); arr2.add(9);	arr2.add(7);
		
		Collections.sort(arr1);

		System.out.println("\n\t\t\t\t  Array List A \n\n\n\t\t\t\t" +arr1); 
		//Sorting arr1 & arr2
		
		Collections.sort(arr2);

		System.out.println("\n\t\t\t\t  Array List B \n\n\n\t\t\t\t"+arr2); 
		//Finding the length of the Array1
		int size=arr1.size();
		
		System.out.println("\n\t\t\t\tIntersected numbers are ");
		System.out.println("\n\t\t\t\t************************");
		
		//Using for loop comparing array elements 
		
			for(int i=0;i<size;i++) { 

				//Using contains and get method comparing elements
				
			if(arr1.contains(arr2.get(i)))
			{
					System.out.println("\t\t\t\t\t"+arr2.get(i));					

			}
		
			}
		
		
	}}


