package com.dsa.practice.singlyLinkedList;

public class FindMidAndNthNodeSLL {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public ListNode getMidNode() {
		ListNode slwPtr = head;
		ListNode fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			slwPtr = slwPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slwPtr;
	}

	public void display(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}

	public ListNode getnthNodeFromLast(int n) {
		// TODO Auto-generated method stub
		if(head == null)
		{
			return null;
		}
		if( n <=0 ) {
			throw new IllegalArgumentException ("Invallid Value of N :: "+n);
		}
		ListNode mianPtr = head;
		ListNode refPtr = head;
		int count = 0;
		
		while (count <n) {
		
			if(refPtr == null) {
				throw new IllegalArgumentException(n+" :: is greater than no of Nodes in List");
			}
			
			refPtr = refPtr .next;
			count++;
		}
		
		while(refPtr != null) {
			refPtr = refPtr.next;
			mianPtr =mianPtr.next;
		}
		
		return mianPtr;
	}
	public static void main(String[] args) {

		FindMidAndNthNodeSLL sll = new FindMidAndNthNodeSLL();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		sll.display(sll.head);

		System.out.println();

		ListNode midNode = sll.getMidNode();
		sll.display(midNode);
		System.out.println();
		System.out.println("Middle node --> "+midNode.data);
		
		ListNode nthNodeFromLast = sll.getnthNodeFromLast(2);
		System.out.println();
		sll.display(nthNodeFromLast);
		System.out.println();
		System.out.println(nthNodeFromLast.data);
	}



}
