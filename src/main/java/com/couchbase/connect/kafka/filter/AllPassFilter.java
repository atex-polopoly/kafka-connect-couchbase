package com.couchbase.connect.kafka.filter;

import com.couchbase.connect.kafka.dcp.Event;

public class AllPassFilter implements Filter {

    @Override
    public boolean pass(final Event event) {
        return true;
    }
}
