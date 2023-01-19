
/**
 * This is a class that enables the connection of one
 * object to another in a list.
 * 
 * Byt Emmanuel Okala Uduma
 * 
 */
public class LinkNode
{
    // instance variables
    public Object object;
    public LinkNode next;

    /**
     * Constructor for objects of class LinkNode
     */
    public LinkNode(Object object, LinkNode next)
    {
        // initialise instance variables
        this.object = object;
        this.next = next;
    }
}
