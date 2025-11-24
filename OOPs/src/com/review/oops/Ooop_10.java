package com.review.oops;
enum Book{
	JAVA(500,250), JDBC(300,150), HTML(200,100);
	int noOfPages;
	int cost;
	private Book(int noOfPages, int cost) {
		this.noOfPages = noOfPages;
		this.cost = cost;
	}
	public void getBookDetails() {
		System.out.println(noOfPages+"---->"+cost);
	}
}
class BookClass{
	public static final BookClass JAVA = new BookClass(500,250);
	public static final BookClass JDBC = new BookClass(300,150);
	public static final BookClass HTML = new BookClass(200,150);
	int noOfPages;
	int cost;
	public BookClass(int noOfPages, int cost) {
		this.cost = cost;
		this.noOfPages = noOfPages;
	}
	public void getBookDetails() {
		System.out.println(noOfPages+"--->"+cost);
	}
}
public class Ooop_10 {

	public static void main(String[] args) {
		System.out.println("Amazon books store");
		System.out.println("------------------");
		System.out.println("Number of books pages cost");
		System.out.println("--------------------------");
		Book.JAVA.getBookDetails();
		Book.JDBC.getBookDetails();
		Book.HTML.getBookDetails();
		System.out.println("===========================\n");
		
		System.out.println("Oxford books Store");
		System.out.println("------------------");
		System.out.println("Number of books pages cost");
		System.out.println("--------------------------");
		BookClass.JAVA.getBookDetails();
		BookClass.JDBC.getBookDetails();
		BookClass.HTML.getBookDetails();
	}

}
