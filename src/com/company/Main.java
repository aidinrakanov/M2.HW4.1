package com.company;

public class Main {

    public static void main(String[] args) {

        Thread runner1 = new Thread(new Runner());
        Thread runner2 = new Thread();
        Thread runner3= new Thread();
        Thread runner4 = new Thread();
        Thread runner5 = new Thread();

        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();
        runner5.start();

    }
}

