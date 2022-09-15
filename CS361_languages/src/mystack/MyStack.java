/**
 * 
 */
package mystack;

/**
 * @author Matthew Contrabasso
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
		
	}

	
	public T pop() {
		// TODO To complete
		
		//System.out.println(theStack.next.next.val);
		
		while(theStack.next != null)
		{
			theStack=theStack.next;
		}
		
		Object item= new Object();
		item=theStack.val;
		
		theStack.val=null;
		return (T) item;
	}

	public void push(T v) {
		// TODO To complete
		if(theStack==null)
		{
			theStack= new MyNode(v, null);
		}
		else
		{
			theStack.next=new MyNode(v,null);
		}
		
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack <Integer> stack1= new MyStack<Integer>();
		stack1.push(1);
		stack1.push(2);
		System.out.println(stack1.pop());
		stack1.push(5);


		// TODO To complete
		// Create a stack of Person
		MyStack <Person> stack2= new MyStack<Person>();
		// Push a person p1 with your name
		Person p1= new Person();
		p1.setFname("Matthew");
		p1.setLname("Contrabasso");
		
		stack2.push(p1);
		
		// Push a person p2 with my name
		Person p2= new Person();
		p1.setFname("Christelle");
		p1.setLname("Scharff");
		
		stack2.push(p2);
	}

}
