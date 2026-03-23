package com.dsa.practice.doublyLinkedList;

public class AddElementInDLL extends DoublyLinkedList{
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		dll.displayForward();
//		dll.displayBackward();
		dll.insertAtEnd(30);
		dll.displayForward();
		dll.deleteFirst();
		dll.displayForward();
		dll.deleteLeast();
		dll.displayForward();
	}

	
}
