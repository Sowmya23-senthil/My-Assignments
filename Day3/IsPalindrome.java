package weekOne.Day3;

public class IsPalindrome {

	//private static String k;

	public static void main(String[] args) { 
		String i = "madnam";
		String rev="";
		System.out.println(i);
		int j = i.length();
		System.out.println(j);

		{
		for(int k= i.length()-1;k>=0;k--)
			
			 rev += i.charAt(k);
		//int k = 1;
		System.out.println(rev);
		
		}
		if(i.equals(rev)) 
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}	
}

//int p= i.lastIndexOf(i);
//System.out.println(p);
//String vp= String.valueOf(i);
//System.out.println(vp);

///char c= i.charAt(2);
//System.out.println(c);

