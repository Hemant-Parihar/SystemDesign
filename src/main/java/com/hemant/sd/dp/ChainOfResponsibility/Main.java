package com.hemant.sd.dp.ChainOfResponsibility;

import com.hemant.sd.dp.ChainOfResponsibility.Logger.DebugError;
import com.hemant.sd.dp.ChainOfResponsibility.Logger.ErrorLogger;
import com.hemant.sd.dp.ChainOfResponsibility.Logger.InfoLogger;
import com.hemant.sd.dp.ChainOfResponsibility.Logger.LoggerAbstract;

public class Main {
    public static void main(String[] args) {
        LoggerAbstract loggerAbstract = new InfoLogger( new DebugError( new ErrorLogger( null)));

        String msg = "This is the message";

        loggerAbstract.handleRequest(LoggerAbstract.DEBUG, "This is exception");
        loggerAbstract.handleRequest(LoggerAbstract.ERROR, "System Error has happened.");
        loggerAbstract.handleRequest(LoggerAbstract.INFO, "Printed userId.");
    }
}
