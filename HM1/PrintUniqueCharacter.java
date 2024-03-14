package week3.HM1;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		//Declaring String and converting to character Array
		String name="Saranya";
		char[] name1=name.toCharArray();
		
		Set<Character> duplicate=new TreeSet<Character>();
		//Using for loop to add the characters to the  Tree Set
		for(int i=0;i<name.length();i++)
		{
			duplicate.add(name1[i]);
		}
//Converting to String Array & printing characters without special chars		
	      String dup=duplicate.toString();
		System.out.print(dup.replaceAll("[^a-z A-Z]",""));

	       
		
	}

}
