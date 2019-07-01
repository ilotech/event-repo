package org.ilot.eventrepo;

import org.ilot.eventrepo.cassandra.Location;

public interface Locatable {
    Location getLocation();
}
