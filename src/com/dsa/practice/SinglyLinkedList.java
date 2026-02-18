package com.dsa.practice;

import com.dsa.practice.SinglyLinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {

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

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		sll.head.next = second; // 10 --> 20
		second.next = third; // 10 --> 20 --> 8
		third.next = fourth; // 10 --> 20 --> 8 --> 11 --> null
//		fourth.next = null;

		sll.display();
	}
}
