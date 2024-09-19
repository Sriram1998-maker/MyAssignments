package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Library lb = new Library();
    String addedBook = lb.addBook("Prince of Persia");
    System.out.println("Book Name : " + addedBook);
    lb.issueBook();
	}

}
