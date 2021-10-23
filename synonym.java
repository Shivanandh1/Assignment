package com.shiva.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class add{
	 public void createFile() throws IOException {
	 
BufferedWriter bw = null;
try {
	bw = new BufferedWriter(new FileWriter("emps.txt", true));
//	String name = null;
//	bw.write("Name is :" + name+"\n");
//	bw.newLine();
//	String sy = null;
//	bw.write("synonym is : "+sy+"\n");
//	bw.newLine();
} catch (IOException e) {
	e.printStackTrace(); 
} finally {
	bw.close();
}
        HashMap<String, String> synonym  = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
         System.out.println("To store a synonym");
          System.out.println("Enter a word ");
          String name = br.readLine();
          System.out.println("Enter Synonym");
          String sy=br.readLine();
          synonym.put(name, sy);	
          System.out.println("Please enter a word to look for synonym");
          String word=br.readLine();
          String a=synonym.get(word);
          System.out.println("synonym is :"+word+" "+a);
        }
}
}
class codeExit{
	public void exit(){
		System.out.println("Successfully exited");
		System.exit(0);
	}
}

public class Synonym {
	
	public static void main(String[] args) throws IOException{
                     
		// creating a My HashTable Dictionary
		//Hashtable<String, String> synonym  = new Hashtable<String, String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int i=0;
		    while(i<3) {
		    	System.out.println("please enter choice");
		    	i=Integer.parseInt(br.readLine());
		    	switch(i) {
		    	case 1:
		    		add obj1=new add();
		    		obj1.createFile();
		    	case 0:
		    		codeExit ce=new codeExit();
		    		ce.exit();
		    		System.out.println("Successfully exited");
		    	}
		    	if(i>2) {
		    		System.out.println("not possible");
		    	}
		    }
	}

}

		
		
		
		
		
  
