package weekTwo.Day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Test ="changeme";
		//char[] b = "";
		char[] a =Test.toCharArray();
		for (int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				//String b;
				char uppercase=Character.toUpperCase(a[i]);
				a[i]=uppercase;

				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
			}
		}

	}
}
