package project1;

 class DoublyLinkedList {
	 private DLink head;
     private int size;
     public DoublyLinkedList() {
  	   head = null;
  	   size = 0;
     }
     public void addFront(int data) {
  	     if(head==null)
  	    	 head = new DLink(null, data ,head);
  	     else {
  	    	 DLink newLink = new DLink(null, data, head);
  	    	 head.previous = newLink;
  	    	 head = newLink;
  	     }
  	     size++;
  	     
     }
     public void addRear(int data) {
  	   if(head == null)
  		   head = new DLink(null, data, null);
  	   else {
  		   DLink current = head;
  		   while(current.next != null) {
  			   current = current.next;
  		   }
  		   DLink newLink = new DLink(current, data, null);
  		   current.next = newLink;
  	   }
  	   size++;
     }
     public void removeFront() {
  	   if(head == null)return;
  	   head= head.next;
  	   head.previous = null;
  	   size--;
     }
     public void removeRear() {
  	   if(head == null) return;
  	   
  	   if(head.next == null) {
  	   head = null;
  	   size--;
  	   return;
     }
     DLink current = head;
     while(current.next.next != null) {
     current = current.next;
     }
     current.next = null;
     size--;
     }
     public void insertAt(int data, int index) {
  	   if(head == null) return;
  	   if(index < 1|| index > size) return;
  	   
  	   DLink current = head;
  	   int i = 1;
  	   while(i < index) {
  		   current = current.next;
  		   i++;
  	   }
  	   if(current.previous == null) {
  		   DLink newLink = new DLink(null, data, current);
  		   current.previous = newLink;
  		   head = newLink;
  	   }
  	   else {
  		   DLink newLink = new DLink(current.previous, data, current);
  		   current.previous.next = newLink;
  		   current.previous = newLink;
  	   }
  	   size++;
     }
     public void removeAt(int index) {
  	   if(head == null) return;
  	   if(index < 1 || index >size) return;
  	   
  	   DLink current = head;
  	   int i = 1;
  	   while(i < index) {
  		   current = current.next;
  		   i++;
  	   }
  	   if(current.next == null) {
  		   current.previous.next = null;
  	   }
  	   else if(current.previous == null) {
  		   current = current.next;
  		   current.previous = null;
  		   head = current;
  	   }
  	   else
  	   {
  		   current.previous.next =current.next;
  		   current.next.previous = current.previous; 		   
  	   }
  	   size--;
     }
    
     
     public int size() {
  	   return size;
     }
     public void print() {
  	   DLink current = head;
  	   while(current != null) {
  		   System.out.println(current.Data());
  		   current = current.next;
  	   }
     }
     public boolean isEmpty() {
  	   return head == null;
     }}