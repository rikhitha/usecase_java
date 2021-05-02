package lab.java.one.com;

class LinkedList_20 {

	  
	  Node head;

	  
	  static class Node {
	    int value;

	    
	    Node next;

	    Node(int d) {
	      value = d;
	      next = null;
	    }
	  }

	  public static void main(String[] args) {

	    
	    LinkedList_20 linkedList = new LinkedList_20();

	    
	    linkedList.head = new Node(1);
	    Node second = new Node(2);
	    Node third = new Node(3);
	    

	    
	    linkedList.head.next = second;
	    second.next = third;

	   
	    Node pointer = linkedList.head;
	    System.out.print("LinkedList: " );
	    while (pointer != null) {
	      System.out.print(pointer.value + " ");
	      pointer = pointer.next;
	    }

	    
	    Node ptr1 = linkedList.head;
	    Node ptr2 = linkedList.head;

	    while (ptr1.next != null) {

	      
	      ptr1 = ptr1.next;
	      if(ptr1.next !=null) {
	        ptr1 = ptr1.next;
	        ptr2 = ptr2.next;
	      }
	    }

	    System.out.println("\nMiddle Element: " + ptr2.value);

	  }
	}