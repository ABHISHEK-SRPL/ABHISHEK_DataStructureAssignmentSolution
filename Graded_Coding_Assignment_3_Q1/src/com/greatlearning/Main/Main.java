package com.greatlearning.Main;
import java.util.Scanner;

import com.greatlearning.Service.*;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {

		int floors;
		System.out.println("Enter the total no of floors in the building");
		floors = input.nextInt();

		int[] floor = new int[floors];
		
		for (int i = 0; i < floors; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			floor[i] = input.nextInt();
			}

		Service Object = new Service();

		System.out.println("The order of construction is as follows \n");
		Object.printOrder(floor);
	}	
}