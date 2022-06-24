package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Ques1-----=------------------------------------
public class Qus1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter Marks:-");
		
		for (int i = 0; i < 5; i++)
		{
			list.add(sc.nextInt());
		}
		double avgM=list.stream().collect(Collectors.averagingInt(a->a));
		System.out.println("Avrg Marks:-  "+avgM);
	}
}
