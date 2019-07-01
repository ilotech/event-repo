package org.ilot.eventrepo.cassandra;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.util.UUID;

import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;
import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

@PrimaryKeyClass
public class SalesEventKey {
    @PrimaryKeyColumn(name = "day_bucket", type = PARTITIONED)
    private final int dayBucket;

    @PrimaryKeyColumn(name = "timestamp", ordinal = 0, ordering = DESCENDING)
    private final long timestamp;

    @PrimaryKeyColumn(name = "event_id", ordinal = 1)
    private final UUID id;

    public SalesEventKey(int dayBucket, long timestamp, UUID id) {
        this.dayBucket = dayBucket;
        this.timestamp = timestamp;
        this.id = id;
    }
}