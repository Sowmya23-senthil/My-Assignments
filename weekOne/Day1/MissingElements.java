package weekTwo.Day1;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,2,8,6,7};
		Arrays.sort(arr);
		System.out.println();
		int i;

		
		for(i=1;i<arr.length;i++)
		{
			int n ;
		n= arr[i-1];
				
			if(n!=i) {
	        System.out.println("The number "+i+ " is not in the array");
			break;
			}

		}

	}
	}
