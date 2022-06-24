package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

// Qus8 -----------------------------
public class Ques8 
{
	public static boolean method(int number)
	{
		Predicate<Integer> evenorN=a->(a%2==0);
				return evenorN.test(number);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no ");
		int  sum=sc.nextInt();
		
		if(Ques8.method(sum)==true)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("not Even");
		}
	}
}
