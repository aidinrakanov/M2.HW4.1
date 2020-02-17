package com.company;

public class Main {

    public static void main(String[] args) {

        Thread runner = new Thread(new Runner());

        runner.start();

    }
}

