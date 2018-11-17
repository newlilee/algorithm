package com.grokkingalgorithms.breadthfirstserarch;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

/**
 * @author clx 2018/11/16
 */
public class BreadthFirstSearch {

	private static Map<String, List<String>> graph = new HashMap<>();

	public static void main(String[] args) {
		init();
		System.out.println(search("you"));
	}

	/**
	 * breadth-first search
	 * 
	 * @param name
	 */
	private static boolean search(String name) {
		if (StringUtils.isBlank(name)) {
			return false;
		}
		Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

		// searched node
		List<String> searched = new ArrayList<>();

		while (!searchQueue.isEmpty()) {
			String person = searchQueue.poll();
			if (!searched.contains(person)) {
				if (isMangoSeller(person)) {
					System.out.println(person + " is mango seller.");
					return true;
				} else {
					searchQueue.addAll(graph.get(person));
					searched.add(person);
				}
			}
		}
		return false;
	}

	/**
	 * mango seller
	 * 
	 * @param name
	 * @return
	 */
	private static boolean isMangoSeller(String name) {
		return StringUtils.endsWith(name, "m");
	}

	/**
	 * init graph
	 */
	private static void init() {
		graph.put("you", Arrays.asList("alice", "bob", "claire"));
		graph.put("bob", Arrays.asList("anuj", "peggy"));
		graph.put("alice", Collections.singletonList("peggy"));
		graph.put("claire", Arrays.asList("thom", "jonny"));
		graph.put("anuj", Collections.<String>emptyList());
		graph.put("peggy", Collections.<String>emptyList());
		graph.put("thom", Collections.<String>emptyList());
		graph.put("jonny", Collections.<String>emptyList());
	}
}
