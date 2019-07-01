package org.ilot.eventrepo.cassandra;

import org.ilot.eventrepo.Event;
import org.ilot.eventrepo.Locatable;

public class SalesEvent implements Event, Locatable {

    private final SalesEventKey salesEventKey;

    private final PropertyDetails propertyDetails;

    public SalesEvent(SalesEventKey salesEventKey, PropertyDetails propertyDetails) {
        this.salesEventKey = salesEventKey;
        this.propertyDetails = propertyDetails;
    }

    @Override
    public Location getLocation() {
        return this.propertyDetails.getLocation();
    }
}