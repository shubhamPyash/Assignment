package Assignment;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class Qus12
{
 interface maxAry
{
	
	void maximuAry(int a[]);
}

	public static void main(String[] args) 
	{
		
	List<Integer> li=new ArrayList<Integer>();
	
	maxAry m=(int a[])-> {
		for(int i=1;i<a.length;i++)
		{
			li.add(a[i]);
		}
		Integer max=li.stream().max((a1,a2)-> a1>a2 ? 1:-1).get();
		System.out.println("maximum no:- "+max);
	};
	m.maximuAry(new int[] {20,80,60,555,450,76,89});
	
	}
	
}
