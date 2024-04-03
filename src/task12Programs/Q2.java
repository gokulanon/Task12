package task12Programs;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Java");
		arrayList.add("Selenium");
		arrayList.add("Array");
		arrayList.add("List");
		arrayList.add("Remove");

		System.out.println("Before removal of ArrayList" +arrayList);

		arrayList.clear();

		System.out.println("After removal of ArrayList" +arrayList);

	}

}
