package com.couchbase.connect.kafka.filter;


import com.couchbase.connect.kafka.dcp.Event;

/**
 * General interface to select Couchbase events, which has to be sent to Kafka.
 *
 * @author mstadelmann@atex.com
 */
public interface Filter {

    /**
     * Decides whether <code>event</code> should be sent to Kafka.
     *
     * @param event DCP event object from Couchbase.
     * @return true if event should be sent to Kafka.
     */
    boolean pass(Event event);

}
