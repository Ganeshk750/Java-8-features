package com.thread;


/**
 * @created: 07/09/2021 - 11:28 AM
 * @author: Ganesh
 */

class Task {

    public void doTask() {
        for(int i=1; i <= 1500; i++) {
            System.out.print("T");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Print M's
        for(int i=1; i <= 1500; i++) {
            System.out.print("M");
        }

        // Call the task to print T's
        Task t1 = new Task();
        t1.doTask();

    }
}
