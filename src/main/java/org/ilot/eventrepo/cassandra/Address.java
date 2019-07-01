package org.ilot.eventrepo.cassandra;

public class Address {
    private final String street;
    private final String city;
    private final int zip;
    private final String state;

    public Address(String street, String city, int zip, String state) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }
}
