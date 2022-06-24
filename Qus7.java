package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Quest7--WAP to print only those price which are even from the given item list

public class Qus7
{
	int id;
	String itmName;
	int itmPrice;
	public Qus7(int id, String itmName, int itmPrice)
	{
		
		this.id = id;
		this.itmName = itmName;
		this.itmPrice = itmPrice;
	}
		
}

class Qus9Main
{
	public static void main(String[] args)
	{
		List<Qus7> evenList=new ArrayList<Qus7>();
		
		evenList.add(new Qus7(1, "mobile",100));
		evenList.add(new Qus7(1, "",50));
		evenList.add(new Qus7(1, "airpod",170));
		evenList.add(new Qus7(1, "toy",80));
		evenList.add(new Qus7(1, "HeadPhone",90));
		evenList.add(new Qus7(1, "water",10));

		List<Integer> itemlist=evenList.stream().filter(a->a.itmPrice%2==0).map(a->a.itmPrice).collect(Collectors.toList());
		
		System.out.println(itemlist);

	}
}


