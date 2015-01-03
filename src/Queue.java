/**Description: as specified by our instructor Rob Nash our goal is 
 * to build three classes that will implement the following
 * List, Stack, and Queue using Nodes and references.The Stack 
 * and Queue will inherit from the List (a linked list) class, and 
 * so these subclasses will be rather short. Then, build a simple
 * LinkedListException class that will be thrown in place of 
 * RuntimeExceptions whenever exceptional or error situations occur.
 * Project: Queue.java
 * @author shayanraouf 
 * Due Date: November 16, 2014
 * */
public class Queue extends List{
	

	
	/**This method inserts by calling the insert method which 
	 *inserts in FIFO*/
	public void enqueue(Object next){
		super.insert(next, super.size());
	}
	
	/**This method removes in FIFO format*/
	public Object dequeue(){
		Object retVal = super.remove(0);
		return retVal;
	}
	 
	 /**@override*/
	public void insert(Object next){
		enqueue(next);
	}
	
	public Object remove(int num){
		return dequeue();
	}
	
	public static void main(String[] args){
		
		Queue stack = new Queue();
		stack.enqueue("happy1");
		stack.enqueue("happy2");
		stack.enqueue("happy3");
		System.out.println(stack);
		//stack.dequeue();
		//stack.dequeue();
		//stack.dequeue();
		System.out.println(stack);
		
	}

}
