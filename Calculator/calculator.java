package calculator.usecase.java.com;

import java.io.Serializable;
import java.util.Scanner;

public class calculator  extends BaseClass
{

	public static void main(String[] args) 
	{
		
	    
		char operator;
	    Double number1, number2, result;

	    
	    Scanner input = new Scanner(System.in);
	    Addition add=new Addition();
	    Subtraction sub=new Subtraction();
	    Multiplication mul=new Multiplication();
	    Division div=new Division();
	    Squareroot sqrt=new Squareroot();
	    Cuberoot cube=new Cuberoot();
	    Tan tan=new Tan();
	    Cos cos=new Cos();

	   
	    System.out.println("Choose an operation: \n 1) + \n 2) - \n 3) *\n 4) / \n 5) SQRT \n 6) CUBE ROOT \n 7) Tan \n 8) Cos ");
	    operator = input.next().charAt(0);

	    switch (operator) {

	      
	      case '1':
	    	  System.out.println("Enter first number");
		  	    number1 = input.nextDouble();

		  	    System.out.println("Enter second number");
		  	    number2 = input.nextDouble();
		  	    add.addition(number1, number2);
		  	    
	        break;

	      
	      case '2':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	  	  sub.subtraction(number1, number2);
	        break;

	      
	      case '3':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	  	  mul.multiplication(number1, number2);
	        break;

	      
	      case '4':
	    	  System.out.println("Enter first number");
	  	    number1 = input.nextDouble();

	  	    System.out.println("Enter second number");
	  	    number2 = input.nextDouble();
	  	  div.division(number1, number2);
	        break;
	        
	      case '5':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	 sqrt.squareroot(number1);
          break;

	      case '6':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	 cube.cuberoot(number1);
	  	 break;
	      case '7':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  tan.tan(number1);
	  	 break;
	      case '8':
	    	  System.out.println("Enter number");
	  	    number1 = input.nextDouble();
	  	  cos.cos(number1);
	  	 break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    

	    input.close();
	    

	}
	

}
