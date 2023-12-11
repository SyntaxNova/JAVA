package Atharva;

import java.util.Scanner;

public class PublicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter title : ");
		String booktitle = scanner.next();
		System.out.print("Enter price : ");
		float bookprice = scanner.nextFloat();
		System.out.print("Enter copies : ");
		int bookcopies = scanner.nextInt();
		System.out.print("Enter author : ");
		String bookauthor = scanner.next();
		
		System.out.print("Enter title of magzine: ");
		String Magzinetitle = scanner.next();
		System.out.print("Enter price of magzine: ");
		float magzineprice = scanner.nextFloat();
		System.out.print("Enter copies magzine: ");
		int magzinecopies = scanner.nextInt();
		System.out.print("Enter current issue : ");
		int magzinecurrentissue = scanner.nextInt();
		
		Book book = new Book( booktitle, bookprice, bookcopies, bookauthor);
		Magzine magzine = new Magzine(Magzinetitle, magzineprice, magzinecopies , magzinecurrentissue);
		
		System.out.print("total sale of book : Rs" + book.totalsale()+ "\n");
		System.out.print("total sale of magzine : Rs" + magzine.totalsale()+ "\n");
		
		
	}

}
