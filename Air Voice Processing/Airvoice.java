package airvoice.java.streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import streams.java.user.com.User;

public class Airvoice extends BaseClass{

	public static void main(String[] args)
	
	{
		ArrayList<Customer> cus = new ArrayList<>();
		Streams filterob=new Streams();
		
        cus.add( new Customer("c001","jack","India","7871831342","prepaid","true"));
        cus.add(new Customer("c002","kirti","SouthAfrica","9956473425","prepaid","true"));
        cus.add(new Customer("c003","Peter","SouthAfrica","206300924","prepaid","true"));
        cus.add( new Customer("c004","vishal","Tanzania","6256473425","prepaid","true"));
        cus.add( new Customer("c005","preethi","Austria","6156473425","postpaid","false"));
        cus.add( new Customer("c006","sam","Belarus","9156473425","prepaid","false"));
        cus.add( new Customer("c007","anjali","Tanzania","4956473425","postpaid","false"));
        cus.add( new Customer("c008","daisy","Uganda","616322924","prepaid","true"));
        
       while(true)
       {
    	System.out.println("enter choice \n 1)fetch first 5 records \n 2)fetch customers from Tanzania with postpaid connection and no vas enabled \n 3)fetch customers from South Africa with prepaid connection and vas enabled \n 4)fetch customer details whose num starts from 61 and  from Uganda \n 5) Records based on customer id \n 6) Convert  "
    			+ "customer name to uppercase" );
   		Scanner sc=new Scanner(System.in);
   		int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	filterob.FirstFive(cus);
				 break;
        
        case 2:
        	filterob.CustomerTanzania(cus);
           break;
           
        case 3:
        	filterob.CustomerSouthAfrica(cus);
           break;
           
        case 4:
            
        	filterob.Num61(cus);
        	
        	
        	break;
        	
        case 5:
        	filterob.CustomerId(cus);
        	break;
        case 6:
        	filterob.UpperCase(cus);
        	
        	break;
	        
        	
        	
        	
        	
            
        	
        	
        }
        
       }
		
	}

}
