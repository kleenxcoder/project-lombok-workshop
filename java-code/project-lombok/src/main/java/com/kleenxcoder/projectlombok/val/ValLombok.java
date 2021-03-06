package com.kleenxcoder.projectlombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class ValLombok {

	public String example() {
		val example = new ArrayList<String>();
		example.add("Hello, World!");
		val foo = example.get(0);
		return foo.toLowerCase();
	}

	public void example2() {
		val map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(5, "five");
		for (val entry : map.entrySet()) {
			System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}

// my opinion: introducing new keyword to java makes less sense if there is already an existing keyword
// var has been introduced in Java 10 this makes lombok's keyword obsolete. this could also happen with val
// other than that when comparing number of lines of code nothing changed.