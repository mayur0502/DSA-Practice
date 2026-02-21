package com.dsa.practice.singlyLinkedList;


public class ReverseSLL {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode  head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}
	
	public ListNode reverse(ListNode head) {

		if(head ==null) {
		return head;
		}
		ListNode current = head; 
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		ReverseSLL sll = new ReverseSLL();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		sll.head.next = second;
		second.next = third;
		third.next= fourth;
		
		sll.display(sll.head);
		
		System.out.println();
		ListNode reverse = sll.reverse(sll.head);
		sll.display(reverse);

	}
}
