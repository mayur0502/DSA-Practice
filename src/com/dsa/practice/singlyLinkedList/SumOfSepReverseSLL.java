package com.dsa.practice.singlyLinkedList;

public class SumOfSepReverseSLL {

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
	public ListNode sum(ListNode a,ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		int carry = 0;
		
		while(a!= null || b!= null) {
			int x = (a!=null) ?a.data:0;
			int y = (b!=null) ?b.data:0;
			int sum = carry+x+y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail= tail.next ;
			if(a!= null) 
				a = a.next;
			if(b!= null)
				b =b.next;
		}
		if(carry >0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		SumOfSepReverseSLL sll = new SumOfSepReverseSLL();
		sll.list1 = new ListNode(7);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);
		sll.list1.next = second;
		second.next = third;

		sll.list2 = new ListNode(5);
		ListNode second2 = new ListNode(6);
		sll.list2.next = second2;

		sll.display(sll.list1);		 // 947
		System.out.println();		//+ 65
		sll.display(sll.list2);
		ListNode sum = sll.sum(sll.list1,sll.list2);
		System.out.println();
		sll.display(sum);
	}
}
