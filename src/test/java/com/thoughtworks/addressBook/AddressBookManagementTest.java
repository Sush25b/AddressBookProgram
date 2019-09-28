package com.thoughtworks.addressBook;

import com.thoughtworks.addressBook.book.AddBook;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class AddressBookManagementTest
{
    @Test
    public void giveFileName_whenFileCreated_thenReturnTrue() throws IOException
    {
        AddBook addBook= new AddBook();

        Assert.assertEquals(true, (addBook).createBook("BusinessContact"));
    }
}
