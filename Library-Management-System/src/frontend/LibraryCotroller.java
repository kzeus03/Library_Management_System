package frontend;

import java.sql.SQLException;
import java.util.*;
import backend.Books;

public class LibraryCotroller {

	public void choiceRelocator(int choice) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Books books=new Books();
		switch(choice) {
		case 1:books.getBookList();
			   break;
			   
		case 2:System.out.println("Enter book name : ");			   
		   	   String bookName=sc.next();
		   	   books.searchBook(bookName);
		   	   break;
		   	   
		case 3:System.out.println("Enter Book name : ");
			   String BookName=sc.next();
			   System.out.println("Enter version : ");
			   int version=sc.nextInt();
			   System.out.println("Enter quantity : ");
			   int quantity=sc.nextInt();
			   books.insertBookData(BookName, version, quantity);
			   break;
			   
		case 4:System.out.println("Enter book name to delete : ");
			   String bName=sc.next();
			   books.deleteBookData(bName);
			   break;
			   
		case 5:System.out.println("choose one service : ");
		       System.out.println("1.Change name");
		       System.out.println("2.Change version");
		       System.out.println("3.Change quantity");
		       int updateChoice=sc.nextInt();
		       switch(updateChoice) {
		       case 1:System.out.println("Enter old book name : ");
	       		  	  String OldBookName=sc.next();
		    	   	  System.out.println("Enter new book name : ");
		       		  String UpdatedBookName=sc.next();
		       		  books.updateBookName(OldBookName,UpdatedBookName);
		       		  break;
		       case 2:System.out.println("Enter book name : ");
		              String CurBook=sc.next();
		              System.out.println("Enter new version number : ");
		              int UpdatedVersion=sc.nextInt();
		              books.updateBookVersion(CurBook,UpdatedVersion);
		              break;
		       case 3:System.out.println("Enter book name : ");
		    	   	  String CurrBook=sc.next();
		    	      System.out.println("Enter book quantity : ");
		              int UpdatedQuantity=sc.nextInt();
		              books.updateBookQuantity(CurrBook,UpdatedQuantity);
		              break;
		       }
		       
		
		}
		
		
	}
}
