package com.dsa.practice.singlyLinkedList;


public class InserNodeEndOfSLL {

	private ListNode head;
	
	private static class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
					
		}
	}		
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}
	
	public void insertAtEnd(ListNode newNode) {
		ListNode current = head;
		while(current.next != null) {
			current= current.next;
		}
			current.next = newNode;	
			}
	
	public static void main(String[] args) {
		InserNodeEndOfSLL sll = new InserNodeEndOfSLL();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.display();
		System.out.println();
		ListNode newNode = new ListNode(50);
		sll.insertAtEnd(newNode);
		sll.display();
	}

}
