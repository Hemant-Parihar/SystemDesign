package com.hemant.sd.dp.ChainOfResponsibility.Logger;

public class ErrorLogger extends LoggerAbstract{

    public ErrorLogger(LoggerAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void handleRequest(int level, String msg) {
        if (level == ERROR) {
            System.out.println("Error " + msg);
        } else {
            super.handleRequest(level, msg);
        }
    }
}
