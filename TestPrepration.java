package com.java.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class TestPrepration {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(10);
		l.add(5);

		l.stream().sorted().forEach(System.out::println);
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		l.stream().filter(i -> i == 10).forEach(System.out::println);

		Map<Integer, Book> m = new HashMap<>();
		m.put(1, new Book(1, "book 1"));
		m.put(3, new Book(3, "book 3"));
		m.put(2, new Book(3, "book2"));
		Map<Integer, Book> filterMap = m.entrySet().stream().filter(entry -> entry.getValue().getBookId() == 3)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		System.out.println(filterMap);

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		while(!q.isEmpty())
			System.out.println(q.poll());
	}

}
