package com.shiva.ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class synonym2 {
	
   public static void main(String[] args) throws IOException {
	   Hashtable<String, String> synonym  = new Hashtable<String, String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   while(true) {
		         System.out.println("To store a synonym");
		          System.out.println("Enter a word ");
		          String name = br.readLine();
		          System.out.println("Enter Synonym");
		          String sy=br.readLine();
		          synonym.put(name, sy);
		          System.out.println("enter 1 to continue or 0 to exit");
		          int j=0;
		          j=Integer.parseInt(br.readLine());
		          if(j==0) {
		        	  System.out.println("Please enter a word to look for synonym");
		        	  String word=br.readLine();
		              String a=synonym.get(word);
		              System.out.println("synonym is :"+word+"= "+a);
		              System.exit(0);
		              }
		          }
		
		        }
	
}

