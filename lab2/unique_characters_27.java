package lab.java.two.com;

import java.util.Scanner;

public class unique_characters_27 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String word = sc.nextLine(); 
		int count=0;
		for (int i = 0; i < word.length(); i++)
		{
            for (int j = i + 1; j < word.length(); j++)
            {
                if (word.charAt(i) == word.charAt(j))
                {
                	count++;
                }
                    
                
            }
		}
		if(count>0)
		{
			System.out.println("String has Duplicate Characrters");
		}
		else
		{
			System.out.println("String has unique characters");
		}
        
        

	}

}
