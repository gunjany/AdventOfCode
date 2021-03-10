/*package whatever //do not write package name here */

import java.io.*;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

class day2 {
	public static void main (String[] args) {
	    
		int validPass = 0;
		//int ii =0;
		try{
			File inputFile = new File("inputday2.txt");
			Scanner myReader = new Scanner(inputFile);
			while (myReader.hasNextLine()) {
				int count = 0;
				String str = myReader.nextLine();
				//System.out.println("str "+ii+" = "+str);
				String[] split_input = str.split(" ");    //1-3 a: abcde   1-3 ; a:  ;  abcde
				String[] min_max = split_input[0].split("-");
				String[] c1 = split_input[1].split(":");
				char c = c1[0].charAt(0);
				int v1 = Integer.parseInt(min_max[0]);
				int v2 = Integer.parseInt(min_max[1]);
				//char c = str.charAt(4);
				String pass = split_input[2];
				//for(String s: arr)
				//  System.out.println(s);
				System.out.println("v1: "+v1);
				System.out.println("v2: "+v2);
				System.out.println("c: "+c);
				System.out.println("pass: "+pass);
				
				int passLength = pass.length();
				
				for(int i = 0; i<passLength; i++)
				{
					if(c == pass.charAt(i))
						count++;
				}
				System.out.println("Count of char: "+count);
				if(count >= v1 && count <= v2){
					System.out.println("Valid password = " + pass);
					validPass++;
				}
				//ii++;
			}	
			myReader.close(); 
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
		  System.out.println("valid passwordds total: "+validPass);
	}
}