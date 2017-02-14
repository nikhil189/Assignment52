/**
 * 
 */
package myPack;

import java.util.Scanner;

/**
 * @author nikhil
 *implementation of Fixed andVariable Stack 
 */
public class StackImplementation {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Please Enter your choice::: - 1 for Fixed Stack, 2:-- Variable Stack");
			Scanner objScanner = new Scanner(System.in);
			int iStackChoice = objScanner.nextInt(); // capture user input for fixed or variable stack
			System.out.println("Please Enter stack size"); // to initialize array stack and get user input for how many values to be inserted
			int iStackSize = objScanner.nextInt();// capture size of stack
			switch(iStackChoice) // switch case to initialize object for fixed and variable stack and process
			{
				case 1:
				{
					FixedStack objFixedStack = new FixedStack(iStackSize); // initialize fixed size stack
					System.out.println("Please enter values to push in stack.. To exit Press any key other than number"); 
					while (objScanner.hasNextInt()) // loop to continue till user enters something else other than integer
					{
						objFixedStack.push(objScanner.nextInt());
					}
				}
				break;
				case 2: 
				{
					VariableStack objVariableStack = new VariableStack(iStackSize);
					System.out.println("Please enter values to push in stack.. To exit Press any key other than number");
					while (objScanner.hasNextInt()) // loop to continue till user enters something else other than integer
					{
						objVariableStack.push(objScanner.nextInt());
					}
				}
				break;
				case 3 :
				{
					System.out.println("Please provide a valid imput");
				}
			}
			objScanner.close(); // closing scanner object
		}
		catch(Exception ex)
		{
			
		}
	}

}
