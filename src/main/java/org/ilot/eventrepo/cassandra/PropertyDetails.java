package org.ilot.eventrepo.cassandra;

import org.springframework.data.cassandra.core.mapping.Column;

public class PropertyDetails {
    private final int bedrooms;
    private final int baths;

    @Column("size_in_sqr_feet")
    private final int sizeInSqrFeet;
    private final String type;
    private final int price;
    private final Location location;
    private final Address address;


    public PropertyDetails(int bedrooms, int baths, int sizeInSqrFeet, String type, int price, Location location, Address address) {
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.sizeInSqrFeet = sizeInSqrFeet;
        this.type = type;
        this.price = price;
        this.location = location;
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }
}