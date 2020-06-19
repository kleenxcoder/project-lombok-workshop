package com.kleenxcoder.projectlombok.var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VarJava {

	public String example() {
		ArrayList<String> example = new ArrayList<String>(); // remove boilerplate -> ArrayList<String> example = new ArrayList<>();
		example.add("Hello, World!");
		String foo = example.get(0);
		return foo.toLowerCase();
	}

	public void example2() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(5, "five");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
