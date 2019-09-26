package com.thoughtworks.addressBook;

import com.thoughtworks.addressBook.book.AddBook;
import com.thoughtworks.addressBook.book.AddressBookManager;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

public class AddressBookManagerTest
{
    @Test
    public void giveAFileName_whenCreated_thenReturnTrue() throws IOException
    {
        AddressBookManager addressBookManager= new AddBook();

        Assert.assertEquals(true, ((AddBook) addressBookManager).createBook("BusinessContact"));
    }
}
