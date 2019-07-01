package org.ilot.eventrepo.service;

import org.ilot.eventrepo.cassandra.SalesEvent;
import org.ilot.eventrepo.cassandra.SalesEventRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalesEventServiceImpl implements SalesEventService {

    @Autowired
    private SalesEventRepository salesEventRepository;

    @Override
    public void storeEvents(List<SalesEvent> events) {
        salesEventRepository.insert(events);
    }

    @Override
    public List<SalesEvent> getEventsByDay(int dayBucket) {
        return salesEventRepository.findByKeyDayBucket(dayBucket);
    }

    @Override
    public List<SalesEvent> getEventsByTimeRange(long startTimestamp, long endTimestamp) {
        // calculate dayBucket
        int mockDayBucket = 20;
        return salesEventRepository.findByKeyDayBucketAndKeyTimestampGreaterThanAndKeyTimestampLessThan(
                mockDayBucket, startTimestamp, endTimestamp);
    }
}