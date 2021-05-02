package fruitshop.collections.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;








public class FruitShop extends BaseModel
{
	 

	


	public static void main(String[] args) 
	{
		FruitShop fsob=new FruitShop(); 
		ArrayList l=new ArrayList();
		Fruits fruitob = new Fruits();
		
		System.out.println(" choose: \n 1) Add Item,Sort item \n 2) Exit ");
		
		Scanner scob=new Scanner(System.in);
		int val=scob.nextInt();
		switch(val)
		{
		case 1:System.out.println("Add Item,Sort item");
		addFruits();
		break;
		case 2:
		
		System.exit(0);
		break;
		default:System.out.println("enter valid operation");
		}
	}
		public static void searchFruits(ArrayList<Fruits> f)
		{
			SearchFruits sfob=new SearchFruits();
			sfob.search(f);
		
	        
			
		}
		
	
	public static void sortFruits(ArrayList<Fruits> f)
	{
		
		Collections.sort(f, new Sortbycost());
		 
        System.out.println("\nSorted by fruit cost");
        for (int i=0; i<f.size(); i++)
            System.out.println(f.get(i));
	}
	public static void addFruits()
	{
		ArrayList<Fruits> list = new ArrayList<Fruits> ();
		
		for(int j =0;j<=1;j++)
	    {

	    Scanner scnr = new Scanner(System.in);

	    String fruitname;
	    String fruittype;
	    String fruitcolor;
	    int fruitcost;
	    
	    
	    	
	   

	    
	    Fruits fruitob = new Fruits();

	    System.out.println("Enter Fruit Name:");
	    fruitob.setfruitname(scnr.nextLine());


	    System.out.println("Enter Fruit Type:");
	    fruitob.setfruittype(scnr.nextLine());

	    System.out.println("Enter Fruit Color:");
	    fruitob.setfruitcolor(scnr.nextLine());

	    System.out.println("Enter Fruit Cost:");
	    fruitob.setfruitcost(scnr.nextInt());

	    
	    list.add(fruitob);



        
	    }
	    
		for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }
	   
		sortFruits(list);
		searchFruits(list);
	    }
	}
	

