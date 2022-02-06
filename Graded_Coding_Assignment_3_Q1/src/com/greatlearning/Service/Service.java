package com.greatlearning.Service;
import java.util.*;

public class Service {

	Stack<Integer> stack = new Stack<>();

	void sortStack(int array[]) {
		Stack<Integer> tempSt = new Stack<>();
		
		if (array.length == 0) {
			return;
		}

		stack.push(array[0]);
		int i = 1;
		
		int el;
		
		while (i < array.length) {
				el = (int) stack.peek();
				
				if (array[i] >= el)
				stack.push(array[i]);
				
				else {
				
					el = (int) stack.peek();
			
					while (array[i] < el && !stack.isEmpty()) {
					tempSt.push(stack.pop());
					
					if (stack.isEmpty())
						break;
					
					else
					
						el = (int) stack.peek();
				}
				
					stack.push(array[i]);

				while (!tempSt.isEmpty())
					stack.push(tempSt.pop());
			}
			i++;
		}
	}

	public void printOrder(int[] floor) {
		
		sortStack(floor);

		boolean floordone[] = new boolean[floor.length];
		
		for (int i = 0; i < floor.length; i++) {
			floordone[floor[i] - 1] = true;
			
			System.out.println("Day: " + (i + 1));
		
			if (floor[i] != (int) stack.peek())
				System.out.println();
			
			else {
			
				while (!stack.isEmpty() && floordone[(int) stack.peek() - 1]) {
					int el = stack.pop();
					System.out.print(el + " ");
				}
				System.out.println();
			}
		}
	}
}