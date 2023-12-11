package Atharva;
import java.util.*;

public class Publication {
	String Title;
	float price;
	int copies;
	
	Publication(String Title,float price,int copies){
		this.Title = Title;
		this.price= price;
		this.copies= copies;
	}
	public int salecopy(int sales) {
		return copies -= sales;
		
	}
	public float totalsale() {
		return copies*price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
class Book extends Publication {
    String author;

    Book(String title, float price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }
    void orderCopies(int orderedCopies) {
        copies += orderedCopies;
    }
}
class Magzine extends Publication{
	int currentissue;
	
	Magzine(String title, float price, int copies, int currentissue){
		super(title, price, copies);
		this.currentissue = currentissue;
	}
	void orderQty(int orderedQty) {
		copies += orderedQty;
	}
	void receiveissue(int newIssue) {
		int currentissue = newIssue;
	}
}
