package com.dsa.practice.binarySearchTree;

public class BinarySearchTree {

	Node root;

	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	boolean search(Node root, int searchVal) {
		if (root == null) {
			return false;
		} else if (root.data == searchVal) {
			System.out.println("SearchVal found");
			return true;
		} else if (searchVal < root.data) {
			return search(root.left, searchVal);
		} else if (searchVal > root.data) {
			return search(root.right, searchVal);
		}
		return false;
	}

	  Node delete(Node root, int key) {
	        if (root == null) return null;

	        if (key < root.data) {
	            root.left = delete(root.left, key);
	        } else if (key > root.data) {
	            root.right = delete(root.right, key);
	        } else {
	            // Case 1 & 2: one or no child
	            if (root.left == null) return root.right;
	            if (root.right == null) return root.left;

	            // Case 3: two children
	            Node minNode = findMin(root.right);
	            root.data = minNode.data;
	            root.right = delete(root.right, minNode.data);
	        }
	        return root;
	    }
	  Node findMin(Node root) {
		    while (root.left != null) root = root.left;
		    return root;
		}
}
