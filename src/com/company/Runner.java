
package com.company;

public class Runner extends Thread {

    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                int next = i + 1;
                System.out.println("Runner " + i + " берет палочку");
                System.out.println("Runner " + i + " бежит к Runner " + next);
                sleep(1000);
            }
            System.out.println("Runner 5 берет палочку" );
            System.out.println("Runner 5 бежит к финишу" );
            sleep(1000);

            System.out.println("Runner 5 бежит к Runner 4");
            sleep(1000);
            for (int i = 4; i > 1; i--) {
                int previous = i -1;
                System.out.println("Runner " + i + " берет палочку");
                System.out.println("Runner " + i + " бежит к Runner " + previous);
                sleep(1000);
            }
            System.out.println("Runner 1 берет палочку" );

        } catch (Exception m) {
        }
    }
}

