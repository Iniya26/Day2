package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		
	Library lo=new Library ();
	lo.addBook();
	String bookTitle = lo.bookTitle();
	System.out.println(lo.bookTitle());
	lo.issueBook();
	}

}
