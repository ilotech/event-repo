package org.ilot.eventrepo.kafka;

// build kafka connector library
public interface KafkaAdapter {

    void storeFromEventStream();
}
