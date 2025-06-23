package weekTwo.Day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName ="TestLeaf";
		String rev ="";
			
		for(int i= companyName.length()-1;i>=0;i--)
		{
				 
			rev += companyName.charAt(i);
		
		
		}
		System.out.println(rev);
		
		
		
		// TODO Auto-generated method stub

	}

}
