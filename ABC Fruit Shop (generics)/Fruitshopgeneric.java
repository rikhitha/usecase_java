package fruit.java.generics.com;



import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;


 
 
class Sortbycost implements Comparator<Fruits>
{
    
    public int compare(Fruits a, Fruits b)
    {
        return b.fruitcost - a.fruitcost;
    }
}
class SortbyName implements Comparator<Fruits>
{
    @Override
    public int compare(Fruits a, Fruits b)
    {
        return b.fruitname.compareTo(a.fruitname);
    }
}

public class Fruitshopgeneric extends Base {

	public static void main(String[] args)
	{
		ArrayList<Fruits> ar = new ArrayList<Fruits>();
        ar.add(new Fruits("apple","cit","green","ROHINI'S  FOOD PRODUCTS",230));
        ar.add(new Fruits("grapes","cit","black","IG INTERNATIONAL",90));
        ar.add(new Fruits("mango","cit","yellow","ANMOL FRUIT DISTRIBUTORS",110));
        ar.add(new Fruits("banana","cit","Red","ROHINI'S FOOD PRODUCTS",80));
        
        Scanner sc=new Scanner(System.in);
        System.out.println("choose : \n 1)VIEW PRODUCT DETAILS \n 2) SORT BY COST \n 3) SORT BY NAME \n 4) SEARCH PRODUCTS");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	System.out.println("Product Details");
            for (int i=0; i<ar.size(); i++)
                System.out.println(ar.get(i));
            break;
        case 2:Collections.sort(ar, new Sortbycost());
 
        System.out.println("\nSorted by fruit cost");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
       
        break;
        case 3:
        	Collections.sort(ar, new SortbyName());
 
        System.out.println("\nSorted by fruit name");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
        break;
        case 4:
        	System.out.println("SEARCH PRODUCTS");
        	System.out.println("1) Search By Fruitname \n 2)Search by Distributor ");
        	Scanner f=new Scanner(System.in);
        	int searchnum=f.nextInt();
        	switch(searchnum)
        	{
        	case 1 :
        	System.out.println("enter fruitname");
        	Scanner d=new Scanner(System.in);
        	String fruitname=d.nextLine();
        	switch(fruitname)
        	{
        	case "mango":
        		
            	Fruits result1=ar.stream().filter(x->"mango".equals(x.getFruitname())).findAny().orElse(null);
            	System.out.println(result1);
            	break;
        	case "banana":
        		
            	Fruits result2=ar.stream().filter(x->"banana".equals(x.getFruitname())).findAny().orElse(null);
            	System.out.println(result2);
            	break;
        	case "grapes":
        		Fruits result3=ar.stream().filter(x->"grapes".equals(x.getFruitname())).findAny().orElse(null);
            	System.out.println(result3);
            	break;
        	case "apple":
            	Fruits result4=ar.stream().filter(x->"apple".equals(x.getFruitname())).findAny().orElse(null);
            	System.out.println(result4);
            	break;
            default:
            	System.out.println("product not in stock");
        	}
        	break;
        	case 2:
        		System.out.println("enter fruitname");
            	Scanner da=new Scanner(System.in);
            	System.out.println("Choose Distributor \n 1)ROHINI'S FOOD PRODUCTS \n 2)IG INTERNATIONAL \n 3)ANMOL FRUIT DISTRIBUTORS");
            	int distributorname=da.nextInt();
            	switch(distributorname)
            	{
            	case 1:
            		
            		Fruits result1=ar.stream().filter(x->"ROHINI'S FOOD PRODUCTS".equals(x.getDistributorname())).findAny().orElse(null);
                	
            		System.out.println(result1);
                	
                	
                	break;
            	case 2:
            		
                	Fruits result2=ar.stream().filter(x->"IG INTERNATIONAL".equals(x.getDistributorname())).findAny().orElse(null);
                	System.out.println(result2);
                	break;
                case 3:
            		
                	Fruits result3=ar.stream().filter(x->"ANMOL FRUIT DISTRIBUTORS".equals(x.getDistributorname())).findAny().orElse(null);
                	System.out.println(result3);
                	break;
                default:
                	System.out.println("enter a valid option");
            	}
        		
        	}
        	
        	
        	
        	
        
        
        }
        
        
 
        
 
        
 
        
		

	}

}
