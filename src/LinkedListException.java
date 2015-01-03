/**Description: LinkedListException with extends RuntimeException 
 * therefore inheriting all the functionalities of 
 * RunTimeException. We will be using this for our
 * List class calling it and throwing new exceptions
 * when needed. 
 * Project: LinkedListException.java
 * @author shayanraouf 
 * Due Date: 11/16/2014
 */
public class LinkedListException extends RuntimeException {
	
	/**Constructor that accepts an argument
	 * of type String and passes it in to 
	 * parent class which prints the error message*/
	public LinkedListException(String note){
		super(note);
		
	}
	
	/**Constructor that calls the parent class
	 * with no args, default Constructor*/
	public LinkedListException(){
		super();	
	}

}