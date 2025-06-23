package weekTwo.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main (String[]args)
	
	 
	{
		String a1="Stop";
		String b1="Post";
			
		a1=a1.toLowerCase();
		b1=b1.toLowerCase();
				
				
		if(a1.length()!=b1.length()) {
			System.out.println("The String is not an Anagram");
		}
			 
		else
		{
			char[] arr1 =a1.toCharArray();
			char[] arr2 =b1.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if(arr1.equals(arr1))
				
			{
				System.out.println("The String is an Anagram");
				
			}
			
				
		}
		
	}

}
