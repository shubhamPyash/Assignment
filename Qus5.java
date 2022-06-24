package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Qus5 
{
	public static void main(String[] args) {
		
	
	String [] ary= {"rajesh","sahil","Namdev","Sahadev"};
	List<Integer> str=new ArrayList<Integer>();
	
	for(String s:ary)
	{
		int count=0;
		char[] a=s.toCharArray();
		for(char ch:a)
		{
			count++;
		}
		str.add(count);
	}
	System.out.println(str);
	Integer max=str.stream().max((a1,a2)->a1>a2 ? 1:-1).get();
	System.out.println(max);
}
}
