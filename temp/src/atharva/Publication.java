package atharva;
import java.util.*;
public class Publication {
	String title;
	float price;
	int copies;
	
	Publication(String title ,float price , int copies){
		this.title = title;
		this.price = price;
		this.copies = copies;
	}
	
	void saleCopy(int sales) {
		copies -= sales;
	}
	
	double totalsale() {
		return copies*price;
	}
	
	class Book extends Publication{
		String author;
		Book(String title ,float price , int copies, String author){
			super(title,price, copies);
			this.author = author;
		}
		void Ordercopies(int orderedcopies) {
			copies += orderedcopies;
		}
	}
	class Magzine extends Publication{
		int currentissue;
		Magzine(String title ,float price , int copies){
			super(title,price, copies);
			this.currentissue=currentissue;
		}
		void orderQty(int orderedQty) {
			copies += orderedQty;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		String booktitle = scanner.next();
		float bookprice = scanner.nextFloat();
		int bookcopies = scanner.nextInt();
		String bookauthor = scanner.next();
		
		Book book = new Book(booktitle,bookprice,bookcopies,bookauthor);
	}

}
