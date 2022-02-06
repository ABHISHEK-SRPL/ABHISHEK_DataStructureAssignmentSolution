package com.greatlearning.Main;

public class Main {

	public static void main(String args[]) {
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		conversion bstSkew = new conversion();

		Node resultTreeRoot = bstSkew.rightconvert(root);

		Node itr = resultTreeRoot;

		while (itr != null) {
			System.out.println(itr.data);
			itr = itr.right;
		}
	}	
}