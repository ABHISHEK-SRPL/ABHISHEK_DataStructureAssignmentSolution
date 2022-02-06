package com.greatlearning.Main;
import java.util.LinkedList;
import java.util.Queue;

public class conversion {

	static Queue<Node> order;

	public Node rightconvert(Node root) {
		
		order = new LinkedList<Node>();
		inOrder(root);

		Node RSTR = null;
		Node Temp = null;

		while (!order.isEmpty()) {
			if (RSTR == null) {
				RSTR = order.poll();
				Temp = RSTR;
				Temp.right = null;
			}

			else {
				Temp.right = order.poll();
				Temp = Temp.right;
			}
		}

		return RSTR;
	}

	void inOrder(Node node) {
		
		if (node == null)
			return;
		
		if (node.left == null && node.right == null) {
			order.add(node);
			return; }		

		inOrder(node.left);

		order.add(node);

		inOrder(node.right);
	}
}