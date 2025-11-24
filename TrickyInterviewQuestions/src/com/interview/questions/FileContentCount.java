package com.interview.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	public static String path = "C:/Users/Adham/Downloads/Arrays_Classroom_Notes.txt";

	
	public static void main(String[] args) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader(path)))
		{
			String currentline = reader.readLine();
			while(currentline != null) {
				
				lineCount++;
				
				String[] words = currentline.split(" ");
				wordCount = wordCount + words.length;
				
				for(String word : words) {
					charCount += word.length();
				}
				
				currentline = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total Lines in this file 	  : "+lineCount);
		System.out.println("Total Words in this file 	  : "+wordCount);
		System.out.println("Total Characters in this file : "+charCount);
		
		
	}

}
