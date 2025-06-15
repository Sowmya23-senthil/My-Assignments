package weekOne.Day3;

public class Browser {
	 String launchBrowser(String browserName) {
	
	System.out.println("Browser Launched Successfully");
	return browserName;
}
	void loadUrl()
	{
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		Browser bsr = new Browser();
		bsr.launchBrowser("Firefox");
		bsr.loadUrl();		// TODO Auto-generated method stub

	}

}
