package com.thoughtworks.addressBook.book;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddBook implements AddressBookManager
{
        public boolean createBook(String bookName) throws IOException
        {
            File file = new File("/Users/sushantsukhadeophulsundar/Desktop/"+bookName + ".json");

            if ( file.createNewFile())
            {
                System.out.println("File is created");
                return true;
            }
            System.out.println("File of that name already exists");
            return false;
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
