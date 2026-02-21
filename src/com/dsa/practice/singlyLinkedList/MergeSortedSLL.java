package com.dsa.practice.singlyLinkedList;

public class MergeSortedSLL {

	private ListNode list1;
	private ListNode list2;

	private static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display(ListNode current) {

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}

	public ListNode merger(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		while (a != null && b != null) {
			if (a.data <= b.data) {
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = b;
		} else {
			tail.next = a;
		}
		return dummy.next;
	}

	public static void main(String[] args) {
		MergeSortedSLL sll = new MergeSortedSLL();
		sll.list1 = new ListNode(10);
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(20);
		ListNode fifth = new ListNode(22);
		sll.list1.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		sll.list2 = new ListNode(10);
		ListNode second2 = new ListNode(13);
		ListNode third2 = new ListNode(19);
		ListNode fourth2 = new ListNode(25);
		ListNode fifth2 = new ListNode(26);
		sll.list2.next = second2;
		second2.next = third2;
		third2.next = fourth2;
		fourth2.next = fifth2;

		sll.display(sll.list1);
		System.out.println();
		sll.display(sll.list2);
		System.out.println();
		ListNode merger = sll.merger(sll.list1, sll.list2);
		sll.display(merger);
	}

}
