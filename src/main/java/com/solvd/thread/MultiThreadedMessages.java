package com.solvd.thread;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedMessages {

    public static void main(String[] args) throws InterruptedException {

        int messagesCount = 100;

        List<Thread> threads = new ArrayList<>();

        for (int messageId = 0; messageId < messagesCount; messageId++) {
            String message = "This is a message: " + messageId;
            Thread thread = new Thread(
                    () -> MessagePrinter.getInstance().printMessage(message)
            );
            thread.start();

            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
