package com.hemant.sd.dp.ChainOfResponsibility.Logger;

public class DebugError extends LoggerAbstract{

    public DebugError(LoggerAbstract nextLogger) {
        super(nextLogger);
    }

    @Override
    public void handleRequest(int level, String msg) {
        if (level == DEBUG) {
            System.out.println("Debug, " + msg);
        } else {
            super.handleRequest(level, msg);
        }
    }
}
