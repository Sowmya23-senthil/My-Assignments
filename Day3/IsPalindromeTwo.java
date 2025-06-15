package weekOne.Day3;

public class IsPalindromeTwo {

	public static void main(String[] args) {
		int ip, op=0,rem;
	
	 		 ip = 1241;
	 		 
		for(int i=ip;i>0;i=i/10)
		{
			rem=i%10;
			op=op*10+rem;
//			System.out.println(op);
		}
			if(ip == op)
			{	
			System.out.println("Given number is Palindrome");
			}
			else 
			{
				System.out.println("Given number is Not Palindrome");
			}
		// TODO Auto-generated method stub

	}

}
