package com.thoughtworks.addressBook.book;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddBook implements AddressBookManager
{
        public void createBook() throws IOException
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name of address book");
            String book = in.next();

            File file = new File(book + ".json");

            if ( file.createNewFile())
            {
                System.out.println("File is created");
            }
            else
            {
                System.out.println("File of that name already exists");
            }
        }
}

//        Person p=new Person("sushant","hsr",771771,"kar");
//
//        File file=new File("/Users/sushantsukhadeophulsundar/Desktop/trial.txt");
//        List<Person> list=new ArrayList<>();
//        list.add(p);
//
//        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
//        writer.write(p.toString());
//        writer.flush();
