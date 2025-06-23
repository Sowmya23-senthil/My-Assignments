package weekTwo.Day1;

public class ReverseOddStringToReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="Welcome to learn Selenium";
		String[] split = test.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				char[] oddString = split[i].toCharArray();
				for(int j= oddString.length -1;j>=0;j--){
					System.out.print(oddString[j]);
				}
			}
				else
				{
				System.out.print(" "+split[i]+" ");
				}

			}

		}


	}






