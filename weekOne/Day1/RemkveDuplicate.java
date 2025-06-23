package weekTwo.Day1;

public class RemkveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="We learn Java basics as part of Java sessions in java week1";
		System.out.println("We learn Java basics as part of Java sessions in java week1");
		String[] split;
		split =text.split(" ");
		
		int i;
		
		for(i=0;i<split.length;i++)
			 	
		{
			int count = 0;
			for(int j=0;j<split.length;j++)	
			{
				if (split[i].equalsIgnoreCase(split[j])) {
					count++;
				if(count>1) {
					split[j]= " ";
				}
				
			}

			
		}
		System.out.print(split[i]+ " ");
	}

	}
}
