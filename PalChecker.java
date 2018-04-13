/**
 * 
 */
package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author davidc
 *
 */
public class PalChecker {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader keyboard =
		new BufferedReader(new InputStreamReader(System.in));
		String  str = "";
		
		System.out.println("Type a word or sentence and I will tell you if it is a palindrome");
		String perms = keyboard.readLine();
		
		System.out.println("Input			Output\n");
		System.out.println(perms+"		"+perms+" "+strippedString(perms)+" a palindrome");
		
	}
	
	public static String strippedString(String input) 
	{
		String Stripped=input.replaceAll("(\\s|\\p{Punct})", "");
		
		
		//System.out.println(reverse(Stripped));
		String reversedAndStripped=reverse(Stripped);
		String status="";
		
		if (Stripped.equalsIgnoreCase(reversedAndStripped))
			status="IS";
		else
			status="is NOT";
			
			
		return status;
		
	}
	
	
	public static String reverse(String input)
	{
		
		String temp="";
		int i=0;
		
		int StringLength=input.length();

		String reversedWord="";
		int j=0;
		for(j=StringLength;j>0;j--)
		{
			if (!(input.substring(j-1,j)).equals(";")) 
			{
				
				reversedWord=(reversedWord+input.substring(j-1,j));
			
			}
			else
			{
				break;
			}
		}
		
		return reversedWord;
			
	}

}
