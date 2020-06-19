package com.kleenxcoder.projectlombok.var;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.var;

public class VarLombok {

	public String example() {
		var example = new ArrayList<String>();
		example.add("Hello, World!");
		var foo = example.get(0);
		return foo.toLowerCase();
	}

	public void example2() {
		var map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(5, "five");
		for (var entry : map.entrySet()) {
			System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
		}
	}
}
