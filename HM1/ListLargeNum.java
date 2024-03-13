package week3.HM1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLargeNum {

	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<Integer>();
		//Adding numbers to the arr list
		arr.add(3);
		arr.add(2);
		arr.add(11);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		System.out.println("\t\t Added Numbers \n\n\t\t "+arr);
		
		
		//Sorting using Collection
		Collections.sort(arr);
		System.out.println("\n\n\t\t After Sorting Numbers \n\n\t\t "+arr);
		
		
       //Finding arr size  and printing the II large Number
		
		int arrsize=arr.size();
		System.out.println("\n\n\t\t II  Largest Element from the List ===> "+arr.get(arrsize-2));
		
	}

}
