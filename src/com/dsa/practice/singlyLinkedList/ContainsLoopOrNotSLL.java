package com.dsa.practice.singlyLinkedList;

public class ContainsLoopOrNotSLL {

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
	
	public boolean checkLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr !=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(fastPtr == slowPtr) {
				return true;
			}
		}
		return false;
	}
	
	public void display(ListNode head) {
		ListNode current = head;

		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("Null");
	}

	public ListNode getStartLoopValue(ListNode slowPtr) {

		ListNode temp = head;
		while (temp !=slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
			
		}
		return temp;
		
	}
	
	public ListNode getLoopStartData() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				return getStartLoopValue(slowPtr);
			}
		}
		return null;
	}
	
	private void removeLoop(ListNode slowPtr){
		
		ListNode temp = head;
		while(slowPtr.next != temp.next ) {
			temp = temp.next;
			slowPtr = slowPtr.next;
			
		}
		slowPtr.next = null;
	}
	
	public void removeLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr) {
				removeLoop(slowPtr);
				return; 
			}
		}
	}
	
	
	public static void main(String[] args) {
		ContainsLoopOrNotSLL  sll = new ContainsLoopOrNotSLL ();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(30);
		ListNode fifth = new ListNode(50);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next  = second;
//		sll.display(sll.head);
System.out.println(sll.checkLoop());
		
// Find loop starting node data

		ListNode startNode = sll.getLoopStartData();
	System.out.println("Loop Start at data ==> "+startNode.data);

	sll.removeLoop();
	sll.display(sll.head);
	}
}
