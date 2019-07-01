package org.ilot.eventrepo.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface SalesEventRepository extends CassandraRepository<SalesEvent, SalesEventKey> {

    List<SalesEvent> findByKeyDayBucket(int dayBucket);

    List<SalesEvent> findByKeyDayBucketAndKeyTimestampGreaterThanAndKeyTimestampLessThan(
            int dayBucket, long startTimestamp, long endTimestamp
    );
}