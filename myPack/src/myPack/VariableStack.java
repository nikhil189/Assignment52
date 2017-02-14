/**
 * 
 */
package myPack;

/**
 * @author nikhil
 * Class to implemet variable stack
 */
public class VariableStack implements Stack
{
	private int stackSize; // property to define size of stack
	private int top; // propert to check index of last element in array
	private int intStack[]; // array to store stack
	
	public VariableStack(int size) 
	{
		this.stackSize = size;
		top =-1;
		intStack = new int[stackSize];
	}
	
	@Override
	public void push(int l) 
	{
		try
		{
			
			top = top+1;
			if(top>=stackSize)
			{
				 int[] newStack = new int[stackSize*2]; // creating new array with double stack size
			        for(int i=0;i<stackSize;i++)
			        {
			            newStack[i] = intStack[i]; // assigning all values from current stack into new stack
			        }
			        intStack = newStack; 
			        stackSize = stackSize*2; // increasing stack size
			}
			intStack[top] = l; // inserting element into stack
		}
		catch(Exception ex)
		{
			System.out.println("Oops... Seems like an invalid input");
		}
		
	}

	@Override
	public int pop()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
