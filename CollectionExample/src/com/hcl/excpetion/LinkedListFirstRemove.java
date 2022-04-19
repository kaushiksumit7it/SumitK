package com.hcl.excpetion;

import java.util.LinkedList;

public class LinkedListFirstRemove {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use removeFirst() remove the first item from the list
		cars.removeFirst();
		System.out.println(cars);
	}
}
