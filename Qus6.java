package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Qus6:-WAP to create list of item price whose price is less than avg price of all item.


public class Qus6 
{
	int itemId;
	String iName;
	int iprice;
	
	public Qus6(int itemId, String iName, int  iprice)
	{
		super();
		this.itemId = itemId;
		this.iName = iName;
		this.iprice = iprice;
	}
	
	class Qus8Main
	{
		public static void main(String[] args) 
		{
			List<Qus6> iList=new ArrayList<Qus6>();
			iList.add(new Qus6(1, "vadapav", 20));
			iList.add(new Qus6(2, "kachori", 10));
			iList.add(new Qus6(3, "panipuri", 20));
			iList.add(new Qus6(4, "breadpav", 50));
			iList.add(new Qus6(5, "misal", 80));
			
			double avgp=iList.stream().collect(Collectors.averagingDouble(a->a.iprice));
			System.out.println("Average Price:- "+avgp);
			
			List<Integer> itemlist=iList.stream().filter(b-> b.iprice>=avgp).map(b->b.iprice).collect(Collectors.toList());
			System.out.println(itemlist);
		}
	}
}
