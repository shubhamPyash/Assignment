package Assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// Ques16---------------------------------

public class Ques16 
{
   
    String iname;
    String category;
    double price;
    LocalDate dom;
    LocalDate eom;

    public Ques16(String iname, String category, double price, LocalDate dom, LocalDate eom)
    {
        super();
        this.iname = iname;
        this.category = category;
        this.price = price;
        this.dom = dom;
        this.eom = eom;
    }
}

class Qus16main
    {

    public static void main(String[] args)
    {
        List<Ques16> iteml=new ArrayList<>();
        iteml.add(new Ques16("hundai", "car", 600, LocalDate.of(2022, 01, 03), null));
        iteml.add(new Ques16("lenovo", "laptop", 2100, LocalDate.of(2022, 02, 03),  LocalDate.of(2022, 12, 03)));
        iteml.add(new Ques16("headphone", "electronics", 1600, LocalDate.of(2022, 01, 03), null));
        iteml.add(new Ques16("sony", "Camera", 80, LocalDate.of(2022, 06, 15),null));
        iteml.add(new Ques16("plastic", "Bottle", 90, LocalDate.of(2022, 01, 05), LocalDate.of(2022, 07, 15)));

        ////////////////////////////////////////////////////
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date:- ");
        String dateFormat="yyyy,MM,dd";
        DateTimeFormatter df=DateTimeFormatter.ofPattern(dateFormat);
        String date=sc.nextLine();
        LocalDate date1=LocalDate.parse(date, df);
        
//      
//        System.out.println(date1);
        List<Ques16> name=iteml.stream().filter(e->e.dom.compareTo(date1)==0).collect(Collectors.toList());
        for(Ques16 lis:name)
        {
        	System.out.println("item name"+ lis.iname+"item Cat.-"+lis.category   +"price= "+lis.price+"date of manu."+lis.dom+"date of exp:-"+lis.eom);
        }
        
        
     
        
        ///////////////////////////////////////
        System.out.println("Enter category:- ");
//        Scanner sc = new Scanner(System.in);
        String cat=sc.next();
        List<Ques16> ilist=iteml.stream().filter(e->e.category.equals(cat)).collect(Collectors.toList());
        for(Ques16 list1:ilist)
        {
            System.out.println("item name= "+list1.iname+" price= "+list1.price+" date of manufacture "+list1.dom+" date of expiry "+list1.eom );
        }

        ////////////////////////////////////////////////////////////
        System.out.println("Enter first letter:-");
        String start=sc.next();
        List<Ques16> itemnames=iteml.stream().filter(e->e.iname.startsWith(start.toLowerCase())).collect(Collectors.toList());
        for(Ques16 s:itemnames)
        {
        	
            System.out.println("Starting Letter:-"+"item name= "+s.iname+" category "+s.category+" price= "+s.price+" date of manufacture "+s.dom+" date eom "+s.eom );    
        }
        //////////////////////////////////////////////////
       
    }
    }
    
