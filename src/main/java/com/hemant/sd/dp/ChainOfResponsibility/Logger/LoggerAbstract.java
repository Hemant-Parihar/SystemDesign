package com.hemant.sd.dp.ChainOfResponsibility.Logger;

public abstract class LoggerAbstract {
    // This is chain of Responsibility Design Pattern.

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LoggerAbstract nextLogger;

    public LoggerAbstract(LoggerAbstract nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void handleRequest(int level, String message) {
        if (nextLogger != null) {
            nextLogger.handleRequest(level, message);
        }
    }
}
