package org.ilot.eventrepo.service;

import org.ilot.eventrepo.cassandra.SalesEvent;

import java.util.List;

public interface SalesEventService {

    void storeEvents(List<SalesEvent> events);

    List<SalesEvent> getEventsByDay(int dayBucket);

    List<SalesEvent> getEventsByTimeRange(long startTimestamp, long endTimestamp);
}