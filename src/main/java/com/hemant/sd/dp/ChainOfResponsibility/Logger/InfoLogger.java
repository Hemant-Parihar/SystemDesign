package com.hemant.sd.dp.ChainOfResponsibility.Logger;

public class InfoLogger extends LoggerAbstract {

    public InfoLogger(LoggerAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void handleRequest(int level, String msg) {
        if (level == INFO) {
            System.out.println("Info, " + msg);
        } else {
            super.handleRequest(level, msg);
        }
    }
}
