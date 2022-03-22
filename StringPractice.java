package com.java.practice;

public class StringPractice {

	public static String biggerIsGreater(String w) {

		char[] word = w.toCharArray();

		for (int i = w.length() - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (word[j] < word[i]) {
					char temp = word[j];
					word[j]=word[i];
					word[i]=temp;
					int min = j + 1;
					char minChar = word[j + 1];
					for (int k = j + 1; k < w.length(); k++) {
						if (word[k] < minChar) {
							minChar = word[k];
							min = k;
						}
					}
					temp = word[j + 1];
					word[j+1] = word[min];
					word[min] = temp;
					return new String(word);
				}
			}
		}
		return "no answer";
	}

	public static void main(String[] args) {
		System.out.println(biggerIsGreater("ab"));

	}

}
