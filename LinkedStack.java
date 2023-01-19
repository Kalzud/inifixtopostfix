import java.util.EmptyStackException;
/**
 * This is the stack class.
 *
 * Emmanuel Okala Uduma
 * 
 */
public class LinkedStack implements Stack
{
    // instance variables
    protected LinkNode top;

    /**
     * Constructor for objects of class Stack
     */
    public LinkedStack()
    {
        // initialise instance variables
        top = null;
    }
    
    public boolean isEmpty()//check if list is empty
    {
        if (top == null)
        return true;
        else
        return false;
    }
    
    public Object peek()//return top element of stack
    {
       if (isEmpty()) throw new EmptyStackException();
       return top.object;
    }
    
    public void push(Object object)//add new element to top of stack
    {
        top = new LinkNode(object, top);
    }
    
    public Object pop()// to remove top element and return it
    {
        if (isEmpty()) throw new EmptyStackException();
        Object topObject = top.object;
        top = top.next;
        return topObject;
    }
}
