package Atharva;
import java.util.Scanner;
public class Publication {
	String title ;
	float price ;
	int copies ;
	
	Publication(String title,float price,int copies){
		this.title=title;
		this.price = price;
		this.copies = copies;
	}
	public void salecopy(int sales) {
		copies -= sales;
	}
	public float totalsale() {
		return copies*price;
	}
}

 class Book extends Publication{
	String author;
	
	Book(String title,float price,int copies,String author) {
		super( title, price, copies);
		this.author=author;
	}
	void ordercopies(int orderedcopy) {
		copies+=orderedcopy;
	}
}
 class Magzine extends Publication{
	 int currentissue;
	 
	 Magzine(String title,float price,int copies,int currentissue){
		 super( title, price, copies);
		 this.currentissue=currentissue;
	 }
	 
	 void orderQty(int orderedQty) {
		 copies+=orderedQty;
	 }
	 void receiveissue(int newissue) {
		 currentissue=newissue;
	 }
 }
 
