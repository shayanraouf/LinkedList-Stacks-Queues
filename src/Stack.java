/**Description: as specified by our instructor Rob Nash our goal is 
 * to build three classes that will implement the following
 * List, Stack, and Queue using Nodes and references.The Stack 
 * and Queue will inherit from the List (a linked list) class, and 
 * so these subclasses will be rather short. Then, build a simple
 * LinkedListException class that will be thrown in place of 
 * RuntimeExceptions whenever exceptional or error situations occur.
 * Project: Stack.java
 * @author shayanraouf 
 * Due Date: November 16, 2014
 * */

public class Stack extends List{
	
	
	/**This method @Overides the insert method and
	 * refers back to the push method because Stack
	 * is LIFO*/
	public void insert(Object next){
		push(next);
	}
	
	/**This method @Overides the insert method and
	 * refers back to the push method because Stack
	 * is LIFO*/
	public void insert(Object next, int index){
		push(next);
	}
	
	
	/**This method @Overides the remove method and
	 * refers back to the pop method because Stack
	 * is LIFO*/
	public Object remove(){
		return pop();
		
	}
	
	/**This method @Overides the remove method and
	 * refers back to the pop method because Stack
	 * is LIFO*/
	public Object remove(int index){
		return pop();
	}
	
	/**This method removes the value
	 * by LIFO form by calling the super class
	 * and giving it the last index to pop/remove from*/
	public Object pop(){
		Object retVal = super.remove(size() - 1); //parent call
		return retVal; //return the saved value
	}
	
	/**This method the insert method and
	 *by calling the insert method which 
	 *inserts in LIFO*/
	public void push(Object next){		
		super.insert(next,super.size()); //parent call
	}
	
	/**this main method test the code*/
	public static void main(String[] args){
		
		Stack stack = new Stack();
		stack.push("happy1");
		stack.push("happy2");
		stack.push("happy3");
		System.out.println(stack);
		//un-comment
		//stack.pop();
		//stack.pop();
		//stack.pop();
		System.out.println(stack);
		
	}

}

