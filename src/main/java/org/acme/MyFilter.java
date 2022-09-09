package org.acme;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

import org.jboss.logmanager.Level;

public class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord record) {
        if (record.getLevel().equals(Level.ERROR)) {
            record.setMessage(record.getMessage());
        }
        return true;
    }

}
