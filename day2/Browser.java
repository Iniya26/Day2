package week1.day2;

public class Browser {
	// Method to be created under class

 public String browsername(String browsername) {
	 System.out.println("browser launched successfully :" +browsername);
	return (browsername);
	
}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		//Object for class to be created in main method
		Browser bo=new Browser();
		//call the method by object name
		bo.browsername("Chrome");
		bo.loadUrl();
	}

}
