package week1.day2;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		String str= "Welcome to Chennai";
		char[] str1 = str.toCharArray();
		int count=0;
		char a='e';
		for (int i=0; i<str1.length; i++)
		{
			if (str1[i]==a)
				count++;
		}
		System.out.println("Occurance of char " +a+ " is: "+count);
			
	}
}
