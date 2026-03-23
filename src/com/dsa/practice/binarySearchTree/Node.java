package com.dsa.practice.binarySearchTree;

public class Node {

	int data;
	Node left, right;

	public Node(int data) {
		super();
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
