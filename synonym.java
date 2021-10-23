package com.shiva.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Synonym {
	
	public static void main(String[] args) throws IOException{

	
		// creating a My HashTable Dictionary
		Hashtable<String, String> synonym  = new Hashtable<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("To store a synonym");
		System.out.println("Enter a word ");
		String name = br.readLine();
		System.out.println("Enter Synonym");
		String sy=br.readLine();
		
		
		//System.out.println(synonym);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("emps.txt", true));
			bw.write("Name is :" + name+"\n");
			bw.newLine();
			bw.write("synonym is : "+sy+"\n");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			bw.close();
		}
			synonym.put(name, sy);	
		    //System.out.println("synonym is :" + synonym.get(name));
		    System.out.println("Please enter a word to look for synonym");
		    String word=br.readLine();
		    System.out.println(synonym.get(word));
		 
		
		    
	}
}


		
		
		
		
		
  
