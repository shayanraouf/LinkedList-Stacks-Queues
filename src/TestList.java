/**Description: as specified by our instructor Rob Nash our goal is 
 * to build three classes that will implement the following
 * List, Stack, and Queue using Nodes and references.The Stack 
 * and Queue will inherit from the List (a linked list) class, and 
 * so these subclasses will be rather short. Then, build a simple
 * LinkedListException class that will be thrown in place of 
 * RuntimeExceptions whenever exceptional or error situations occur.
 * Project: testList.java
 * @author shayanraouf 
 * Due Date: November 16, 2014
 * */
public class TestList {
	public static List list = new List(); 
public static void main(String[] args){
		
		
		System.out.println("list.isEmpty() : " + list.isEmpty());//checks for empty
		insert(20, 4); //call to insert method 
		System.out.println(list);
		remove(4); // call to remove method
		
	}
	
	/**insert method that calls the list insert method
	 * with loops that takes a max*/
	public static void insert(int value, int max){
		for(int i = 0; i < max; i++){
			list.insert(value,i);
			System.out.println("index of " + value + " is: " + list.indexOf(value));
			value *= 3;
			
		}
		
	}
	
	/**remove method with loops for convience*/
	public static void remove(int max){
		for(int i = 0; i < max; i++){
			System.out.println("removed: " + list.remove(0));
			System.out.println(list);
		}
		
	}
	
}
