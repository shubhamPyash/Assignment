package Assignment;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Qus9-WAP to implement predicate to check given no is even or not-------------

public class Ques9
{
	public static void main(String[] args)
	{
		
//		for odd------
		IntPredicate od=a->a % 2 == 1;
		
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		
		System.out.println(od.test(q));
		
		IntStream st=IntStream.range(1, 10);
		List<Integer> odnum=st.filter(od).boxed().collect(Collectors.toList());
		
		System.out.println(odnum);
		
		
////		for even------
		IntPredicate ev=a->a%2==0;
		System.out.println(ev.test(q));
		
		IntStream st1=IntStream.range(1, 10);
		List<Integer> evnum=st1.filter(ev).boxed().collect(Collectors.toList());
		
		System.out.println(evnum);
	}
}
