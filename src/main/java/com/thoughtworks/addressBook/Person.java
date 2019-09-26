package com.thoughtworks.addressBook;

public class Person
{
    private String name;
    private Long contactNo;
    private String streetName;
    private Long zipcode;
    private String State;

    public Person()
    {
    }

    public Person(String name, Long contactNo, String streetName, Long zipcode, String state) {
        this.name = name;
        this.contactNo = contactNo;
        this.streetName = streetName;
        this.zipcode = zipcode;
        State = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", zipcode=" + zipcode +
                ", State='" + State + '\'' +
                '}';
    }
}
