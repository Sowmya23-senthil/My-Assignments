package weekOne.Day2;

public class FibonacciRange {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int range = 8;
		System.out.println("First " + range + " Fibannocci numbers are below:");
		for(int k= 1;k<=range;k++)
		{	
			System.out.println(i);
			int l=i+j;
			i=j;
			j=l;
		}
		
		// TODO Auto-generated method stub

	}

}
