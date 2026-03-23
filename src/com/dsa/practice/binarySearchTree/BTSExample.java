package com.dsa.practice.binarySearchTree;

public class BTSExample {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		 int[] values = {50, 30, 70, 20, 40, 60, 80};
	
	for(int val:values) {
	bst.root= 	bst.insert(bst.root, val);
	}
	System.out.print("Inorder: ");
    bst.inorder(bst.root);	
	
	int search = 40;

	bst.search(bst.root,search);
	
	bst.delete(bst.root,30);
	
	
	System.out.print("Inorder: ");
    bst.inorder(bst.root);	
}}
