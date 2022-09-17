# java
code
package com.edu.condoper;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
		ch=sc.next().charAt(0);
		
		if(ch=='A') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='E') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='I') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='O') {
			System.out.println(ch+" is an Vowel");
		}
		else if(ch=='U') {
			System.out.println(ch+" is an Vowel");
		}else {
			System.out.println(ch+" is consonant");
		}

	}

}
