package com.dsa.practice.singlyLinkedList;

public class RemoveDupltFrmSortedSll {

	private ListNode head;
	
	private static class ListNode{
		int data;
		ListNode next;
		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}
	
	public void removeDuplt() {
		
		ListNode current = head;
		while(current!= null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
//		head = current;
	}
	
	public static void main(String[] args) {
		RemoveDupltFrmSortedSll  sll = new RemoveDupltFrmSortedSll ();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(30);
		ListNode fifth = new ListNode(50);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		sll.display(sll.head);

		System.out.println();
		sll.removeDuplt();
		sll.display(sll.head);
	}
}
