package weekOne.Day3;

public class Library {
         
	String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return(bookTitle);
	}
	String issueBook()
	{
		System.out.println("Book issued successfully");
		return null;
		
	}
	
	public static void main(String[] args) {
		Library a =new Library();
		a.addBook(null);;
		a.issueBook();
		
		// TODO Auto-generated method stub

	}

}
