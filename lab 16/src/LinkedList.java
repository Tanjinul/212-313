// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
//firt linked list always empty (dummy node)
public class LinkedList {

	/** First node in linked list - dummy node */
	private ListNode first = new ListNode(null);

	/** Last node in linked list */
	private ListNode last = first;

	/** Number of data items in the list. */
	private int length = 0;

	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 * 
	 * @return the number of elements in the list.
	 */

	public int getLength() {
		return length;
	}

	/**
	 * Appends a String data element to this LinkedList.
	 * 
	 * @param data
	 *            the data element to be appended.
	 */
	//append a new node to the end of linked list
	//step1: create a new node
	public void append(String d) 
	{
		// TODO Code here for append
	    ListNode newNode = new ListNode(d); //create new node
	    last.next = newNode; //the node after previous last is now newNode
	    last = newNode; //now the last node will be the newly appended newNode
	    length++; // increase length
	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	//add a new node after the dummy node but before the last one 
	public void prepend(String d) 
	{
	    // TODO Code here for prepend
	    ListNode newNode = new ListNode(d);
	    if(first.next==null)
	    {
	        last = newNode;
	    }
	    newNode.next = first.next; // making the new node point to the node after first.next
	    first.next = newNode;
	    length++;
	}  // method prepend(String)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
	 */
	public String toString() 
	{
		ListNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;
	}

	/**
	 * Determines whether this ShortSequenceLinkedList is equal in value to the
	 * parameter object. They are equal if the parameter is of class
	 * ShortSequenceLinkedList and the two objects contain the same short
	 * integer values at each index.
	 * 
	 * @param other
	 *            the object to be compared to this ShortSequenceLinkedList
	 * 
	 * @return <code>true</code> if the parameter object is a
	 *         ShortSequenceLinkedList containing the same numbers at each index
	 *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
	 */
	public boolean equals(Object other) { //list4.equals(list6). List 6 is other here
		if (other == null || getClass() != other.getClass() || length != ((LinkedList) other).length)
			return false;

		ListNode nodeThis = first;
		ListNode nodeOther = ((LinkedList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.

			if (nodeThis.data != nodeOther.data)
				return false;

			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while

		return true;
	} // method equals

} // class LinkedList

