/**
 * 
 */
package myPack;

/**
 * @author nikhil
 * Class to implement fixed stack
 */
public class FixedStack implements Stack{

	private int stackSize; // property to define size of stack
	private int top; // propert to check index of last element in array
	private int intStack[]; // array to store stack
	
	FixedStack(int Size)
	{
		this.stackSize = Size;
		top =-1;
		intStack = new int[stackSize];
	}
	
	@Override
	public void push(int l) 
	{
		try
		{
			
			top = top+1;
			if(top<=stackSize) // if last index is less than stack size
			{
				intStack[top] = l; // inserting element into stack
			}
			else
			{
				System.out.println("Stack Overflow"); // shows user message of stack over flow
				System.exit(0); // terminationg program
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Stack Overflow");
		}
		
	}

	@Override
	public int pop()
	{
		
		return 0;
	}

}
