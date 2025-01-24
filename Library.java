package week1.day2;

public class Library {

	public void addBook() {
		System.out.println("Book Added Successfully");
		}
	
	String bookTitle () {
		return "Disney Cindrella";
	}
 	
	public void issueBook() {
		System.out.println("Book issued Successfully.");
	}
	
	
	public static void main(String[] args) {
		
		Library lo=new Library();
	   
		lo.addBook();
		String bookTitle = lo.bookTitle();
		System.out.println(lo.bookTitle());
	    lo.issueBook();
	}

}
