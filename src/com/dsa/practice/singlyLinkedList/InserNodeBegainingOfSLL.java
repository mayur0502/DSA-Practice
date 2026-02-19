package com.dsa.practice.singlyLinkedList;


public class InserNodeBegainingOfSLL {

	private ListNode head;
	
	private static class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data){
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
	
	
	public static void main(String[] args) {
		InserNodeBegainingOfSLL sll = new InserNodeBegainingOfSLL();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		System.out.println("Size of Singly LinkedList are ==> "+sll.sizeOfSll());
		sll.display();
		System.out.println();
		ListNode newNode = new ListNode(50);
		newNode.next = sll.head;
		sll.head = newNode;
		sll.display();
	}
	
}
