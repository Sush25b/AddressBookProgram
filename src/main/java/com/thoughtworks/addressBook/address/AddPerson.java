package com.thoughtworks.addressBook.address;

import com.thoughtworks.addressBook.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddPerson implements AddressBook
{
    private static List<Person> people = new ArrayList<Person>();

    /**
     * Function to add a person in the specified address book
     * @return
     */
    public List<Person> addPersonToAddressbook()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = in.next();
        System.out.println("Enter contactNo");
        Long contactNo = in.nextLong();
        System.out.println("Enter street name");
        String streetName = in.next();
        System.out.println("Enter zipcode");
        Long zipcode = in.nextLong();
        System.out.println("Enter State name");
        String stateName = in.next();

        Person person=new Person(firstName,contactNo,streetName,zipcode,stateName);

        people.add(person);
        return people;
    }
}
