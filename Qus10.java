package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Qus10 
{
	int emplid;
	String emplName;
	
	double sal;
	public Qus10(int emplid,String emplName, double sal) {
		
		this.emplid = emplid;
		
		this.emplName = emplName;
		this.sal = sal;
	}
	

}
class Qus10MAin
{
	public static void main(String[] args) 
	{
		List<Qus10> list1=new ArrayList<Qus10>();
		list1.add(new Qus10(1,"Salman" ,10000.0));
		list1.add(new Qus10(2,"Amir" ,10000.0));
		list1.add(new Qus10(3,"Ramesh" ,20000.0));
		list1.add(new Qus10(4,"akshy" ,10000.0));
		list1.add(new Qus10(5,"ram" ,25000.0));
		list1.add(new Qus10(6,"vinod" ,30000.0));
		list1.add(new Qus10(7,"akki" ,21000.0));
		list1.add(new Qus10(8,"jamshed" ,80000.0));
		list1.add(new Qus10(9,"Ashish" ,9000.0));
		list1.add(new Qus10(10,"sagar" ,1000.0));
		
		
		Map<Integer,String>  list=list1.stream().collect(Collectors.toMap(a->a.emplid,a->a.emplName));
		System.out.println(list);
		
		System.out.println();
		Set<String> listSet=list1.stream().map(a->a.emplName).collect(Collectors.toSet());
		System.out.println("employee Name:-  "+listSet);

		
		
		
	}	
}
