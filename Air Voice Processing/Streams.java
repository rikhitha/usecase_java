package airvoice.java.streams.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams 
{
	public void FirstFive(ArrayList<Customer> cust)
	{
		System.out.println("--------------------------------------------");
    	System.out.println("First 5 Records \n ");
    	List<Customer> result1 = cust.stream()
		 
	      .limit(5).collect(Collectors.toList());
	        
			 result1.forEach(p -> System.out.println("Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
			 System.out.println("--------------------------------------------");
	}
	public void CustomerTanzania(ArrayList<Customer> cust)
	{
		System.out.println("--------------------------------------------");
    	System.out.println("Fetch customers from Tanzania with postpaid connection and no vas enabled \n  ");
    	
    	Predicate<Customer> country=x -> x.getCountry()== "Tanzania";
        Predicate<Customer> connectiontype=x -> x.getConnectiontype()== "postpaid";
        Predicate<Customer> vas=x->x.getVas()=="false";
        
        List<Customer> result2 = cust.stream()
                .filter(country.and(connectiontype).and(vas))
                
                
                
                .collect(Collectors.toList());
        
        result2.forEach(p -> System.out.println("Customer ID::"+p.getCustomerid()+" \n"+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+" \n"+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
        
        System.out.println("--------------------------------------------");
	}
	public void CustomerSouthAfrica(ArrayList<Customer> cust)
	{
		System.out.println("--------------------------------------------");
    	
    	System.out.println("Fetch customers from South Africa with prepaid connection and  vas enabled \n  ");
         
    	Predicate<Customer> country1=x -> x.getCountry()== "SouthAfrica";
        Predicate<Customer> connectiontype1=x -> x.getConnectiontype()== "prepaid";
        Predicate<Customer> vas1=x->x.getVas()=="true";
        
        List<Customer> result3 = cust.stream()
                .filter(country1.and(connectiontype1).and(vas1))
                
                
                
                .collect(Collectors.toList());
        
        result3.forEach(p -> System.out.println("Customer ID::"+p.getCustomerid()+" \n"+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
        
        System.out.println("--------------------------------------------");
	}
	public void Num61(ArrayList<Customer> cust)
	
	{
		System.out.println("--------------------------------------------");
		System.out.println("fetch customer details whose num starts from 61 and  from Uganda \n  ");
    	Predicate<Customer> country2=x -> x.getCountry()== "Uganda";
        Predicate<Customer> phone=x -> x.getPhonenumber().startsWith("61");
        
        List<Customer> result4 = cust.stream()
                .filter(country2.and(phone))
                
                
                
                .collect(Collectors.toList());
        
        result4.forEach(p -> System.out.println("Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+"\n "+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+"\n "+"VAS ::"+p.getVas()));
    	
    
    	System.out.println("--------------------------------------------");
	}
	public void CustomerId(ArrayList<Customer> cust)
	{
		System.out.println("--------------------------------------------");
    	System.out.println(" Records based on customer id \n");
    	
    	List<Customer> result5 = cust.stream()
                .filter(x->x.getCustomerid()=="c005")
                
                
                
                .collect(Collectors.toList());
        
    	
    	
    	result5.forEach(p -> System.out.println(" Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+" \n"+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
    	
        
    	System.out.println("--------------------------------------------");
	}
	public void UpperCase(ArrayList<Customer> cust)
	{
		System.out.println("--------------------------------------------");
    	System.out.println(" Customer Name in Upper Case \n");
    	
    	Predicate<Customer> name=x -> x.getCustomername().startsWith("P");
    	List<Customer> result6 = cust.stream()
    			
                .filter(x->x.getCustomerid()=="c005")
                
                
                
                .collect(Collectors.toList());
        
    	
    	
    	result6.forEach(p -> System.out.println(" Customer ID::"+p.getCustomerid()+"\n "+"Customer Name::"+p.getCustomername()+" \n"+"Country::"+p.getCountry()+"\n "+"Phone number::"+p.getPhonenumber()+"\n "+"Connection type::"+p.getConnectiontype()+" \n"+"VAS ::"+p.getVas()));
    	
        
    	System.out.println("--------------------------------------------");
	}

}
