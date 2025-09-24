package com.solvd.thread;

public class MessagePrinter {

    private static final MessagePrinter INSTANCE = new MessagePrinter();

    public static MessagePrinter getInstance() {
        return INSTANCE;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
