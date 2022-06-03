package com.bridgelab.gambler;


import java.util.Random;

public class Gambler2 {

    static int stake=100;
    static int bet = 1;
    static Random betnum= new Random();

    static void method1() {
        System.out.println("the glambler had a stake:" +"" +stake);
        System.out.println("the glambler will bet:" +bet);
    }
    static void method2() {
        int checknum = betnum.nextInt(2);
        if (checknum == 1) {
            System.out.println("he wins");

        } else {
            System.out.println("he lose");
        }
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
}
