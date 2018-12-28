//Class contains enqueue/dequeue functions
public class Queue {
	//front and back listNodes are initialized
	listNode front;
	listNode back;

	//Enqueue function used to add elements to the queue
	public void Enqueue(String cur_str)
	{
		//Create new listNode
		listNode newlistNode = new listNode(cur_str);
		//If the queue is empty
		if(isEmpty())
		{
			//Make the back and front equal to the new listNode
			front = newlistNode;
			back = newlistNode;
		}
		//if not
		else
		{
			//Set the previous listNode of the (old) back listNode to the new listNode
			back.next = newlistNode;
			//Set the new back to the listNode
			back = newlistNode;
		}
	}
	//Checks if the Queue is empty
	public boolean isEmpty()
	{
		//If the front of the queue is null
		if(front == null)
			//Return true
			return true;
		else
			//Otherwise return false
			return false;

	}

	//dequeue to serve the first item of the queue (front item)
	public String Dequeue()
	{
		//If there are no elements in the queue
		if(isEmpty())
		{
			System.out.println("ERROR: The queue is empty");
			//returns null
			return null;
		}
		//If not, the output is the data in the front
		else
		{
			//If there is something in the queue, the element at the front of the queue is copied to "frontValue"
			String frontValue = front.value;
			//The element at the front of the queue is changed for the element which was previously in second place (the previous "next" element)
			front = front.next;
			return frontValue;
		}
	}
	//Returns the front listNode
	public listNode getFront () {
		return front;
	}
	//Returns the rear listNode
	public listNode getback () {
		return back;
	}
}


