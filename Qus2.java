package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Qus2--Distinct No------------------

public class Qus2 {

	public static void main(String[] args) 
	{
		List<Integer> listC=Arrays.asList(1,3,2,4,2,7,8);
		List<Integer> sortedLi=listC.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(listC);
		System.out.println(sortedLi);
	}

}
