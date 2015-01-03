/**Description: as specified by our instructor Rob Nash our goal is 
 * to build three classes that will implement the following
 * List, Stack, and Queue using Nodes and references.The Stack 
 * and Queue will inherit from the List (a linked list) class, and 
 * so these subclasses will be rather short. Then, build a simple
 * LinkedListException class that will be thrown in place of 
 * RuntimeExceptions whenever exceptional or error situations occur.
 * 
 * As for this class in specific which is the List class in addition
 * to a private Node class nested within this class. 
 * Project: List.java
 * @author shayanraouf 
 * Due Date: November 16, 2014
 * */


public class List {
	private Node head;  //the start of the linked list


	/**This method accepts two arguments an object next 
	 * and an int index and inserts the object at the specified index*/
	public void insert(Object next, int index){
		Node current = head;
		Node previous = head; 

		if(head == null){ //adding to an empty list
			if(index != 0){

				throw new LinkedListException("Trying to insert at a out of bounce Index");
			}

			head = new Node(next, head); //insert at the head


		}

		else if(size() == 1){ //adding to a single element list
			//if size is equal to 1, can only add to element 0 or 1 
			if(index != 1 && index != 0){
				throw new LinkedListException("Trying to insert at a out of bounce Index");

			}

			if(index == 0){
				Node tempNode = new Node(next, head);
				head = tempNode;
			}
			else{
				Node tempNode = new Node(next, head.next);
				head.next = tempNode;

			}

		}

		else{ //adding to a list containing great than 1 element

			//Adding to the first 
			if(index == 0){
				Node temp = new Node(next,head);//element ---> head
				head = temp;
			}
			else if(index == size()){ //adding to the tail

				while(current.next != null){

					current = current.next;//iterating through the list

				}
				//Node temp = new Node(next, current.next);
				current.next = new Node(next, current.next);
			}

			else{//adding in between two elements

				//travels through the List		
				for(int i = 0; i < index; i++){
					//sets the current to reference the next node
					previous = current;
					current = current.next; 

				}

				Node newTemp = new Node(next, current);//attach the node to the list
				previous.next = newTemp;//attach the previous node to the temp Node we created
			}
		}

	}

	/**This method removes the first element Node*/
	public Object remove(int index){
		Node current = head;
		Node previous = head;
		Object retVal;

		if(head == null){
			throw new LinkedListException("Trying to remove from an empty list");
		}



		if(index == 0){
			retVal = head.data;
			head = head.next;
		}

		else{ //adding to a list greater than 1 element

			if(index >= size()){ //can't access elements out of bounce, throw exception
				throw new LinkedListException("Bad index value");
			}
			else{

				for(int i = 0; i < index; i++){
					previous = current;
					current = current.next; //updates the current address
				}
				retVal = current.data; //updates the return value
				previous.next = current.next; //Previous points to the current Node
			}


		}
		return retVal;
	}



	/**This method @returns the size
	 * of the elements pertaining the list
	 * but iteratively stepping through the list*/
	public int size(){
		return size(head);
	}
	
	/***/
	private int size(Node start){
		if(start == null){
			return 0;

		}
		return 1 + size(start.next);
	}

	/**This toString method @returns
	 * a String of all the Nodes in the
	 * list with brackets [] 
	 * example: [element0] [element1] etc.*/
	public String toString(){
		return toString(head);
	}

	private String toString(Node start){
		if(start == null){
			return "";		
		}

		return "[" + start.data + "]" + toString(start.next);
	}

	/**@returns true if there are no
	 * elements in the list and false
	 * if the list contains elements*/
	public boolean isEmpty(){
		return head == null;
	}

	/**This method accepts an argument data
	 * that is an object and @returns the index
	 * in which is located at or -1 if not found*/
	public int indexOf(Object data){
		int retVal = -1;
		Node current = head;

		//Executes the while loop if it contains elements
		while(current != null){ 

			retVal++; //keeping track of the index

			/*compares if the value passes is equal 
			to the value in side the list and returns
			the index if equal*/
			if(data.equals(current.data)){
				return retVal;
			}
			current = current.next; //iterates through the list

		}

		return -1; 
	}



	/**Description: This private Node class holds
	 * a Node next and an Object data 
	 * Project: Node class nested inside List class
	 * Author: Shayan Raouf
	 * Due Date: November 16, 2014
	 * */
	private class Node{
		//field declaration 
		Node next = null; //References the address 
		Object data = null; //Actual data it holds


		/**Constructor that takes in two Objects argument 
		 * data and Node as a parameter and initializes*/
		public Node(Object data, Node next){
			this.data = data;
			this.next = next;
		}

	}
}
