// Java program to add elements
// to a LinkedList

import java.util.*;
import java.util.LinkedList;

public class linke{

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");

		System.out.println(ll);
	}
}
