package com.jpayments.question6;

import java.io.IOException;
import java.util.Scanner;

public class Question6Test {

	public void questionTestValidate() throws IOException {
		
		System.out.println("Start Question 6 Test:");
		Scanner textIn = new Scanner(System.in);  
	    String input = textIn.nextLine();
		
	    WikipediaArticle wiki = new WikipediaArticle();
	    System.out.println(wiki.getTopicCount(input));
	    
	    
}
	
	
	
	
}
