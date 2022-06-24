package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

//Qus4-----. WAP to find maximum from array of numbers ------------------

public class Qus4 
{
	public static void main(String[] args) {
		
		ArrayList<Integer> arrylist=new ArrayList<>();
		
		arrylist.add(16);
		arrylist.add(26);
		arrylist.add(3);
		arrylist.add(52);
		arrylist.add(70);
		arrylist.add(12);
		
		System.out.println("max. element in arryList ="+Collections.max(arrylist));
		
		
	}
}
