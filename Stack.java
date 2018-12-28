
public class Stack {
	//Names the listNode top
	listNode top;
	//Push function used to add elements to a stack
	public void push(String cur_str)
	{
		//Initializes a first new listNode which can take data in the form of a string
		listNode newTop = new listNode(cur_str);
		//First listNode now points to the second listNode
		newTop.next = top;
		top = newTop;
	}
	//Pop function used to remove elements from the stuck
	public String pop()
	{
		//If the stack is empty
		if(top == null)
		{
			//It will return null
			return null;
		}
		else
		{
			//
			listNode oldtop = top;
			//The element in the top of the stack is changed for the element which was previously in second place
			top = top.next;
			//Returns the data stored in the listNode at the top of the stack
			return oldtop.value;
		}
	}

	public void print_top()
	{
		//If the top of the stack is not null
		if (top!=null)
		{
			//Output the data stored inside the top listNode of the stack
			System.out.print(top.value+" ");
		}
	}

}
