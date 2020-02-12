package com.company;

public class Runner extends Thread {
    private String[] runner = {"runner 1", "runner 2", "runner 3", "runner 4", "runner 5"};


    public synchronized void run() {
        while (true) {
            for (int i = 0; i < runner.length; i++) {
                    try {
                        sleep(500);
                        join();

                        System.out.println(runner[i] + " получил палочку");
                    } catch (Exception e) {
                    }
                System.out.println(runner[i] + " бежит к " + runner[i + 1]);
            }

            System.out.println(runner[4] + "прибежал к финишу");


            for (int j = 4; j < runner.length; j--) {
                try {
                    sleep(500);
                    join();
                    System.out.println(runner[j] + " получил палочку");
                } catch (InterruptedException e) {
                }
                System.out.println(runner[j] + " бежит к " + runner[j - 1]);
            }
            break;
        }
    }
}