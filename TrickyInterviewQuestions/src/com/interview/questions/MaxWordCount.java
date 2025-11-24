package com.interview.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class MaxWordCount {

	public static String path = "C:/Users/Adham/Downloads/Arrays_Classroom_Notes.txt";

	public static void main(String[] args) throws IOException {
		Map<String, Integer> wordMap = new HashMap<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(path));) {
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");
				for (String word : words) {
					if (!word.isBlank()) {
						if (wordMap.containsKey(word)) {
							wordMap.put(word, wordMap.get(word) + 1);
						} else {
							wordMap.put(word, 1);
						}
					}
				}
				currentLine = reader.readLine();
			}
		} catch (IOException e) {
			e.getMessage();
		}
		wordMap.forEach((k, v) -> System.out.println(k + " : " + v));

		Map<String, Integer> newMap = new HashMap<>();
		wordMap.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
				.forEach(e -> newMap.put(e.getKey(), e.getValue()));
		;

		System.out.println("--------------------");
		System.out.println(newMap);
	}

}
