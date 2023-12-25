package org.example;

abstract class AbstractAccount {
    // Bridge Pattern Here:
    // A abstract class consists of another abstract class or interface
    private Logger logger = Logger.info();

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // the logging part is delegated to the Logger implementation
    protected void operate(String message, boolean result) {
        logger.log(message + " result " + result);
    }
}