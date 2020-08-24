package com.jpayments.challenge;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Question1 {

	public void startChallenge() {
		
		int n = 0;
		Scanner textIn = new Scanner(System.in);
		
	    System.out.println("digitar tamanho da matriz:");	    
	    String entrada = textIn.nextLine();
		
	    String[] t = entrada.split (Pattern.quote (" "));

	    int r = Integer.parseInt(t[0]);
	    int c = Integer.parseInt(t[1]);
	    int[][] matriz = new int[r][c];

	    int val = 0;
		for(int x=4;x>0;x--) {
			System.out.print("[");
			for(int y=7;y>0;y--) {
				if(r==1 && x==1)
					System.out.print(r+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println("]");
		}
		
		
	}

	
	
	
	
	
}
