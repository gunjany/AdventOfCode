/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class day2part2 {
	public static void main (String[] args) {
	    
		int validPass = 0;
		try{
			File inputFile = new File("inputday2.txt");
			Scanner myReader = new Scanner(inputFile);
			while (myReader.hasNextLine()) {
				String str = myReader.nextLine();
				String[] split_input = str.split(" ");    //1-3 a: abcde   1-3 ; a:  ;  abcde
				String[] min_max = split_input[0].split("-");
				String[] c1 = split_input[1].split(":");
				char c = c1[0].charAt(0);
				int v1 = Integer.parseInt(min_max[0]);
				int v2 = Integer.parseInt(min_max[1]);
				String pass = split_input[2];
				// System.out.println("v1: "+v1);
				// System.out.println("v2: "+v2);
				// System.out.println("c: "+c);
				// System.out.println("pass: "+pass);
				
				if(c == pass.charAt(v1-1) && c != pass.charAt(v2-1))
					validPass++;
                else if(c == pass.charAt(v2-1) && c != pass.charAt(v1-1))
                    validPass++;
			}	
			myReader.close(); 
		}catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
		  System.out.println("valid passwordds total: "+validPass);
	}
}
				