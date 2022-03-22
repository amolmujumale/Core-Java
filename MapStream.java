package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {

		Map<Book, Book> m = new HashMap<>();
		Book b1 = new Book(1, "book 1");
		Book b2 = new Book(2, "book 2");
		Book b3 = new Book(3, "book 2");
		Book b4 = new Book(4, "book 3");
		Book b5 = new Book(5, "book 1");
		m.put(b1, b1);
		m.put(b2, b2);
		m.put(b3, b3);
		m.put(b4, b4);
		m.put(b5, b5);

		m.entrySet().stream().filter(entry -> entry.getKey().getBookId() == 2).forEach(System.out::println);
		m.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Book::getBookId)))
				.forEach(System.out::println);
		m.entrySet().stream().sorted(Entry.comparingByKey((book1, book2) -> book2.getBookId() - book1.getBookId()))
				.forEach(System.out::println);

		int sum = m.entrySet().stream().map(entry -> entry.getKey().getBookId()).reduce(0, (o1, o2) -> o1 + o2)
				.intValue();
		System.out.println(sum);
		Entry<Book, Book> smallBook = m.entrySet().stream().reduce(new Entry<Book, Book>() {

			@Override
			public Book getKey() {
				return new Book();
			}

			@Override
			public Book getValue() {
				return new Book();
			}

			@Override
			public Book setValue(Book value) {
				return new Book();
			}
		}, (b11, b22) -> b11.getKey().getBookId() > b22.getKey().getBookId() ? b11 : b22);

		System.out.println("small book: " + smallBook.getKey());

		// @formatter:on

		List<Book> l = new ArrayList<>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		Collections.sort(l, (o1, o2) -> o2.getBookId() - o1.getBookId());
		System.out.println(l);

		m.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Book::getBookId)))
				.forEach(System.out::println);
		m.entrySet().stream().filter(e -> e.getKey().getBookId() == 2).forEach(System.out::println);
		Map<Book, Book> m123 = m.entrySet().stream().filter(e -> e.getValue().getBookId() == 2)
				.collect(Collectors.toMap(mp -> mp.getKey(), mp -> mp.getValue()));
		System.out.println(m123);
		Map<String, List<Book>> map10 = l.stream().collect(Collectors.groupingBy(Book::getBookName));
		System.out.println(map10);
		

		// Entry<Book, Book> smallBook=m.entrySet().stream().reduce(
	}

}
