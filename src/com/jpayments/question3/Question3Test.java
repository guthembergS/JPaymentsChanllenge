package com.jpayments.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Question3Test {

	public void questionTestValidate() {
		
				System.out.println("Start Question 3 Test:");
				Scanner textIn = new Scanner(System.in);  
			    String input = textIn.nextLine();
				
			    int n = Integer.parseInt(input);
			    List<Account> accountList= new ArrayList();
			    List<Account> accountListOrderByPriceDesc= new ArrayList();
			    
			    for(int i=0;i<n;i++) {
			    	input = textIn.nextLine();
			    	String[] t = input.split (Pattern.quote (" "));
			    	Account accountNew = new Account(Integer.parseInt(t[1]),Integer.parseInt(t[2]),t[0]);
			    	accountList.add(accountNew);
			    }
			   
			    Collections.sort(accountList);
			    System.out.println(accountList.get(0).toString());
	}
}
