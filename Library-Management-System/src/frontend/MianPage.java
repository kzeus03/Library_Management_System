package frontend;

import java.sql.SQLException;
import java.util.Scanner;

public class MianPage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int choice;
		LibraryCotroller lib=new LibraryCotroller();
		Scanner sc=new Scanner(System.in);
		System.out.println("                    \t\t\t\tWELCOME TO CENTRAL LIBRARY");
		System.out.println("                     \t\t\t\t====SERVICES AVAILABLE====");
		System.out.println("BOOKS:-");
		System.out.print("1.View Books  ");
		System.out.print("2.Search Books  ");
		System.out.print("3.Add Books  ");
		System.out.print("4.Delete Books  ");
		System.out.print("5.Update Books Data  ");
		choice=sc.nextInt();
		lib.choiceRelocator(choice);
		sc.close();
	}

}
