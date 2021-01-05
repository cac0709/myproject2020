package com.cac910;

import java.util.Scanner;

public class Apcs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("insert");
        String s =in.nextLine();
        String[] tokens = s.split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int result = Integer.parseInt(tokens[2]);
        boolean matched = false;
        if (a>0) {
        	a=1;
        }if(b>0) {
        	b=1;
        }if ((a&b) == result) {
        	System.out.println("AND");
        	matched = true;
        }if ((a|b) == result) {
        	System.out.println("OR");
        	matched = true;
        } if ((a^b) == result) {
        	System.out.println("XOR");
        	matched = true;
        }if (!matched) {
        	System.out.println("IMPOSSIBLE");
        	
            
        	
        
		

	}

	}
}
