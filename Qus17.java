package Assignment;

import java.nio.file.DirectoryStream.Filter;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// Qus17-------------------------------

public class Qus17 {
	
	String empname;
	String workLocation;
	
	LocalDate doj;
	
	LocalDate dob;
	LocalDate dor;
	String dept;
	int sal;


	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDor() {
		return dor;
	}
	public void setDor(LocalDate dor) {
		this.dor = dor;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	public Qus17(String empname, String workLocation, LocalDate doj, LocalDate dob, LocalDate dor, String dept,
			int sal) {
		
		this.empname = empname;
		this.workLocation = workLocation;
		this.doj = doj;
		this.dob = dob;
		this.dor = dor;
		this.dept = dept;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Qus1 [empname=" + empname + ", workLocation=" + workLocation + ", doj=" + doj + ", dob=" + dob
				+ ", dor=" + dor + ", dept=" + dept + ", sal=" + sal + "]";
	}
	public static void main(String[] args) 
	{
		List<Qus17> list=new ArrayList<>();

		
		list.add(new Qus17("Shubham","Ireland", LocalDate.of(2022, 04, 05),LocalDate.of(1998,06,27),LocalDate.of(2025,05,19), "JAVA",22000));
		list.add(new Qus17("Prasad","India", LocalDate.of(2022, 05, 24),LocalDate.of(1999,05,05),LocalDate.of(2025,03,18), "AWS",35000));

		list.add(new Qus17("Akshay","pakistan", LocalDate.of(2022, 06, 05),LocalDate.of(1992,04,05),LocalDate.of(2025,02,11), "JAVA",20000));

		list.add(new Qus17("Akash","Hinjewadi", LocalDate.of(2022, 04, 05),LocalDate.of(1995,05,05),LocalDate.of(2025,04,15), "JAVA",26000));

		list.add(new Qus17("nilesh","pune", LocalDate.of(2022, 06, 27),LocalDate.of(1998,05,05),LocalDate.of(2025,07,10), "AWS",29000));
		list.add(new Qus17("Vinod","Indore", LocalDate.of(2022, 05, 24),LocalDate.of(1993,05,05),LocalDate.of(2025,06,11), "JAVA",25000));

		System.out.println(list);
		
//		double avgSal1=list.stream().collect(Collectors.averagingInt(s1->s1.sal));
//		System.out.println("avg of Salary: "+avgSal1);
		
//		AVG SALARY BY DEPT_--------------------------------
		Double totalavgByDep1=list.stream().filter(Dept ->"JAVA" == Dept.getDept()).collect(Collectors.averagingDouble(Qus17::getSal));
		Double totalavgByDep2=list.stream().filter(Dept ->"AWS" == Dept.getDept()).collect(Collectors.averagingDouble(Qus17::getSal));

		System.out.println("Total Employees salary of JAVA dep :"+ totalavgByDep1);
		System.out.println("Total Employees salary of AWS dep :"+ totalavgByDep2);

//		Highest and lowest salary of each department
		
		int maxSalary = list.stream().filter(Deptm ->"JAVA" ==Deptm.getDept())
				 .map(Qus17::getSal)
				 .max(Integer::compare).get();
		int minSalary = list.stream().filter(Deptm ->"JAVA" ==Deptm.getDept())
				 .map(Qus17::getSal)
				 .min(Integer::compare).get();
	
		System.out.println("maxmium of sal by dept:- " +maxSalary);
		System.out.println("minimum of sal by dept:- "+minSalary);
		
		
//		Department with highest no of employee and lowest 
		String deptt1= list.stream()
				 .map(Qus17::getDept)
				 .max(String::compareTo).get();
		
		String deptt2= list.stream()
				 .map(Qus17::getDept)
				 .min(String::compareTo).get();
		System.out.println("Department with highest no of employee:- "+ deptt1);
		System.out.println("Department with Lowest no of employee:- "+ deptt2);
		
		
		///Current date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println("Current Date >>> " + dtf.format(now));
		   System.out.println("Get month >>> " + now.getMonth());
		   System.out.println("Current Date >>> " + now.getDayOfMonth());
		
//		Total number of years of experience of each employee. 
	
		   System.out.println("------------------No of Experience In years of each Employee-------");
           for(Qus17 e:list)
           {
               if(e.dor!=null )
               {
               int exp=Period.between(e.doj, e.dor).getYears();
               System.out.println(e.empname+" Experience "+exp+" Years.");
               }
           }
		
//		Upcoming birthday and job anniversary in current month from current date to last
		
           System.out.println(" ---------------Upcoming birthday and job anniversary Employee-------");
			
			LocalDate currentdate=LocalDate.now();
			
			List<Qus17> bns=list.stream().filter(e->e.dob.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (Qus17 a : bns)
			{
				System.out.println("Birth day of "+a.empname+" and Birth Date is "+a.dob);
			}
			List<Qus17> bnames1=list.stream().filter(e->e.doj.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (Qus17 a : bnames1)
			{
				System.out.println("Job Anniversary of "+a.empname+" and Anniversary Date is "+a.doj);
			}
		   
//		   
		
	}
	
		
}
