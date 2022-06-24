package Assignment;

import java.util.stream.IntStream;

public class Qus11 
{
	public static void main(String[] args) 
	{
		
		
		IntStream intstram=IntStream.rangeClosed(1,10);
		intstram.forEach(System.out::print);
		
		System.out.println();
		IntStream intstram1=IntStream.rangeClosed(1,10);
		intstram1.parallel().forEach(System.out::print);
	}
}
