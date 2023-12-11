package Atharva;
import java.util.Scanner;
public class PublicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter book title : ");
		String booktitle = scanner.next();
		System.out.print("Enter book price : ");
		float bookprice = scanner.nextFloat();
		System.out.print("Enter book copies : ");
		int bookcopies = scanner.nextInt();
		System.out.print("Enter book author : ");
		String bookauthor = scanner .next();
		
		System.out.print("Enter magzine title : ");
		String magzinetitle = scanner.next();
		System.out.print("Enter magzine price : ");
		float magzineprice = scanner.nextFloat();
		System.out.print("Enter magzine copies : ");
		int magzinecopies = scanner.nextInt();
		System.out.print("Enter magzine currentissue : ");
		int magzinecurrentissue = scanner.nextInt();
		
		Book book = new Book(booktitle,bookprice,bookcopies,bookauthor);
		Magzine magzine = new Magzine(magzinetitle,magzineprice,magzinecopies,magzinecurrentissue);
		
		System.out.print("total sale of book : Rs" + book.totalsale()+ "\n");
		System.out.print("total sale of magzine : Rs" + magzine.totalsale()+ "\n");
	}
}
