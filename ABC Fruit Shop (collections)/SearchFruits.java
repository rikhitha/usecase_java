package fruitshop.collections.java.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;




public class SearchFruits 
{
	public void search(ArrayList<Fruits> fruits)
	{
		System.out.println("--------------------------------------------");
		System.out.println("Deatils of Fruit=Mango \n  ");
    	
        
        List<Fruits> result4 = fruits.stream()
                .filter(x -> x.getfruitname()== "mango")
                
                
                
                .collect(Collectors.toList());
        
        result4.forEach(p -> System.out.println("Fruitname::"+p.getfruitname()+"\n "+"Fruit Type::"+p.getfruittype()+"\n "+"Fruit Color::"+p.getfruitcolor()+"\n "+"Fuit Cost::"+p.getfruitcost()));
    	
    
    	System.out.println("--------------------------------------------");
	}

}
