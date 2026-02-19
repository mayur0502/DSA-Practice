package com.dsa.practice.singlyLinkedList;


public class InserNodeAtGivenPostionSLL {
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
	
	public int insertAtGivenPostion(int position, ListNode newnode) {
	
		if(position>sizeOfSll()) {
			System.out.println(" \n List is lower than Given position");
			return 0;
		}
		
		if(position == 1) {
			newnode.next  = head;
			head = newnode;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count< position-1) {
				previous = previous.next;
						count++;
			}
			ListNode current = previous.next;
			newnode.next= current;
			previous.next = newnode;
		}
		return 0;
	}

	public static void main(String[] args) {
		InserNodeAtGivenPostionSLL sll = new InserNodeAtGivenPostionSLL();

		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		sll.head.next = second;
		second.next = third;
		third.next= fourth;
		
		sll.display();
		System.out.println();
		ListNode newNode = new ListNode(60);
		sll.insertAtGivenPostion(3, newNode);
		sll.display();

	}

}
