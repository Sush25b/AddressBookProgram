package com.thoughtworks.addressBook;



import com.thoughtworks.addressBook.book.AddBook;

import java.io.IOException;
import java.util.Scanner;

public class AddressBookApp
{

    public static void main(String[] args) throws IOException
    {
        do {
            System.out.println("Enter your choice");
            System.out.println(" 1:Create Book \n 2:Open Book \n 3:Save Book \n 4:Save As \n 5:Close Book \n 6:Quit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    AddBook addBook = new AddBook();
                  //  addBook.createBook("BussinessContact");
                    break;

            }
        }while(true);
    }
}
