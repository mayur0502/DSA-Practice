package com.dsa.practice.singlyLinkedList;

import java.util.LinkedList;

public class SumOfSepReverseLinkedList {

	private static LinkedList<Integer> addTwoList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> result = new LinkedList<Integer>();

		int i = 0;
		int carry = 0;
		while (i < l1.size() || i < l2.size() || carry != 0) {

			int sum = carry;
			if (i < l1.size()) {
				sum+=l1.get(i);

			}
			if (i < l2.size()) {
				sum+=l2.get(i);
			}
			result.add(sum%10);
			carry = sum/10;
			i++;
		}

		return result;
	}

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();

		l1.add(7);
		l1.add(4);
		l1.add(9);
		l2.add(5);
		l2.add(6);

		LinkedList<Integer> result = addTwoList(l1, l2);

		System.out.println(result.toString());
	}

}
