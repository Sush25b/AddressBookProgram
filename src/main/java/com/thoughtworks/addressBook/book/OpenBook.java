package com.thoughtworks.addressBook.book;

import com.thoughtworks.addressBook.Person;
import com.thoughtworks.addressBook.Utility;

import java.io.*;
import java.util.Scanner;

public class OpenBook implements AddressBookManager
{
    Scanner in = new Scanner(System.in);
    private File[] getFiles()
    {
        return new File(System.getProperty("user.dir")).listFiles();
    }

    public void openBook() throws IOException {
        System.out.println("Files available are:");
        File[] arrayOfFiles = getFiles();
        for (File file : arrayOfFiles)
        {
            if (file.getName().endsWith(".json"))
                System.out.println(file.getName());
        }

        System.out.println("Choose the address book");
        String checkbook = in.next();

        for (File file : arrayOfFiles)
        {
            String filename = file.getName();
            if (checkbook.equals(filename))
            {
                FileReader fr = new FileReader(filename);
                BufferedReader br = new BufferedReader(fr);

                String jsonString = "", line = "";
                while ((line = br.readLine()) != null)
                {
                    jsonString += line;
                }
                br.close();
                //return str;

                if (file.length() > 0)
                {
                    System.out.println("Address book is not empty");
                    System.out.println(jsonString);

                    //String string = OopsUtility.convertJsonToJava(jsonString, AddressBook.class);
                    Person p = Utility.convertJsonToJava(jsonString,Person.class);

                    System.out.println(p);
                    // Function call to perform various operations on the opened address book
                   // addressBook("filename");
                }
                else
                {
                    System.out.println("Address Book is empty");
                    System.out.println("Add new data onto the Address Book");
                   // addressBook("filename");
                }
            }
        }
    }
}
