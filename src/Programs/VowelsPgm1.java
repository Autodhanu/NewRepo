package Programs;

import java.util.Scanner;

public class VowelsPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a character");
		
		char c = scanner.next().charAt(0);
		
		boolean isVowel=false;
		
		switch(c) {
		
		  case 'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u':
		  case 'A':
		  case 'E':
		  case 'I':
		  case 'O':
		  case 'U': isVowel=true;
		  		
		}
		
		if(isVowel)
		{
			System.out.println(c+" is a vowel");
		}
		else
		{
			System.out.println(c+" is not a vowel");
		}
		
		scanner.close();
		
	}
}

