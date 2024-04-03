package task12Programs;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");

		String[] array = list.toArray(new String[0]);

//print
		System.out.println("Array elements:");
		for (String element : array) {
			System.out.println(element);
		}
	}

}
