package com.dsa.practice.singlyLinkedList;

public class DeleteFirstNodeSLL {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public int sizeOfSll() {
		ListNode current =head;
		int count = 0;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	public void display() {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("Deletion are not allowed list is empty");
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		
	}
	
	private void deleteLast() {
		// TODO Auto-generated method stub
	ListNode current = head;
	ListNode previous= null;
	while(current.next != null) {
		previous = current;
		current = current.next;
	}
	previous.next=null;
	
	}
	
	public void deleteAtGivenPostion(int postion) {
		
		if(postion == 1) {
			head = head.next;
		}else{
			ListNode previous = head;
			int count = 1;
			while (count< postion-1) {
				previous  = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next  = current.next;
			
		}
	}
	
public static void main(String[] args) {
	DeleteFirstNodeSLL sll = new DeleteFirstNodeSLL();
	sll.head = new ListNode(10);
	ListNode second = new ListNode(20);
	ListNode third = new ListNode(30);
	ListNode fourth = new ListNode(40);
	sll.head.next = second;
	second.next = third;
	third.next= fourth;
	
	sll.display();
//	System.out.println();
//	sll.deleteFirst();
//	sll.display();
//	System.out.println();
//	sll.deleteLast();
//	sll.display();
	System.out.println();
	sll.deleteAtGivenPostion(3);
	sll.display();
}

}
