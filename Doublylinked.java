package project1;

public class Doublylinked {

	public static void main(String[] args) {
		DoublyLinkedList doublel = new DoublyLinkedList();
		doublel.addFront(13);
		doublel.addFront(14);
		doublel.addFront(21);
		doublel.addFront(22);
		doublel.print();
		System.out.println("----------------");
		doublel.addRear(9);
		doublel.addRear(1);
		doublel.addRear(12);
		
		doublel.print();
		System.out.println("----------------");
		doublel.removeFront();
		doublel.removeFront();
		doublel.print();
		System.out.println("----------------");
		doublel.removeRear();
		doublel.removeRear();
		doublel.print();
		System.out.println("size  " + doublel.size());
	doublel.insertAt(0,70);
	doublel.insertAt(1,60);
		
	doublel.insertAt(3,4);
	
		
		
	}

}


  
		

 
