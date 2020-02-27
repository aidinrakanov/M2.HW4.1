package com.company;

public class Runner extends Thread {
    private int id;
    private int diraction;

    public Runner(int id, int diraction) {
        this.id = id;
        this.diraction = diraction;
    }

    public synchronized void run() {
        try {
            if (id < 5 && diraction==1) {
                System.out.println("Runner "+id+" beret palochku");
                System.out.println("Runner "+id+" bezhit k runner "+(id+1));
                sleep(1000);
            }
            if (id == 5 ) {
                System.out.println("Runner "+id+" beret palochku");
                System.out.println("Runner "+id+" bezhit k finishu");
                sleep(1000);
                System.out.println("Runner "+id+" bezhit k runner "+(id-1));

            }
            if (id > 1 && diraction==-1) {
                System.out.println("Runner "+id+" beret palochku");
                System.out.println("Runner "+id+" bezhit k runner "+(id-1));
                sleep(1000);
            }
            if (id == 1 && diraction==-1) {
                System.out.println("Runner "+id+" beret palochku");
            }
        } catch (Exception e) {}
    }
}
