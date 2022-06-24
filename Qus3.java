package Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//WAP to take name of employee, sort all employee name using stream and print only unique name from it.

public class Qus3 
{
	public static void main(String[] args) 
	{
		List<String> listname=Arrays.asList("Shubham","ajit","Shubham","rohit","Shourya");
		List<String> sortedLi=listname.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
		
		System.out.println(sortedLi);
		
	}
}
