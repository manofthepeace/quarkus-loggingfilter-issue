package org.acme;

import org.jboss.logging.Logger;

import io.quarkus.runtime.Startup;

@Startup
public class GreetingResource {

    public GreetingResource(Logger log) {
        java.util.logging.Logger.getLogger("org.acme.GreetingResource").setFilter(new MyFilter());
        String var = "test";
        log.infof("This is a message with variable: %s", var);
        log.errorf("This is a message with variable: %s", var);

    }
}