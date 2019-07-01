package org.ilot.eventrepo.kafka;

import org.ilot.eventrepo.cassandra.SalesEvent;
import org.ilot.eventrepo.service.SalesEventService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;

public class KafkaAdapterImpl implements KafkaAdapter {

    @Autowired
    private SalesEventService salesEventService;

    @Override
    public void storeFromEventStream() {
        // read from kafka stream
        // calculate dayBucket
        // create sales event
        SalesEvent mockEvent = null;
        salesEventService.storeEvents(Collections.singletonList(mockEvent));
    }
}
