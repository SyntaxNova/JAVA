package Atharva;
import java.util.*;
public class main {
	String title;
	float price;
	int copies;
	
	main(String title, float price, int copies){
		this.title=title;
		this.price=price;
		this.copies=copies;
	}
	
	void salecopy(int sales) {
		copies-=sales;
	}
	double totalsale() {
		return copies*price;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		String booktitle = scanner.next();
		float bookprice = scanner.nextFloat();
		int bookcopies = scanner.nextInt();
		String bookauthor = scanner.next();
		
		String magzinetitle = scanner.next();
		float magzineprice = scanner.nextFloat();
		int magzinecopies = scanner.nextInt();
		int magzinecurrentissue = scanner.nextInt();
		
		Book book = new Book(booktitle ,bookprice ,bookcopies, bookauthor);
		Magzine magzine = new Magzine(magzinetitle ,magzineprice ,magzinecopies ,magzinecurrentissue);
		
		
		System.out.print("Total sale of book : " + book.totalsale());
		System.out.print("Total sale of book : " + magzine.totalsale());
	}
	
}
class Book extends main{
	String author;
	Book(String title, float price, int copies, String author){
		super(title,price,copies);
		this.author=author;
	}
	void ordercopies(int orderedcopies) {
		copies+=orderedcopies;
	}
}
class Magzine extends main{
	int currentissue;
	Magzine(String title, float price, int copies,int currentissue){
		super(title,price,copies);
		this.currentissue=currentissue;
	}
	void orderqty(int orderedqty) {
		copies+=orderedqty;
	}
	void receiveissue(int newissue){
		currentissue=newissue;
	}
	
}

