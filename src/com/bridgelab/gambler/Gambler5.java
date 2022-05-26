package com.bridgelab.gambler;


import java.util.Random;

public class Gambler5 {

    static int stake = 100;
    static int bet = 1;
    static Random betnum = new Random();

    static void method1() {
        System.out.println("the glambler had a stake:" + "" + stake);
        System.out.println("the glambler will bet:" + bet);
    }

    static void method2() {
        int checknum = betnum.nextInt(2);
        if (checknum == 1) {
            System.out.println("he wins");

        } else {
            System.out.println("he lose");
        }
    }

    static void method3() {
        final int win = 1;
        final int lose = 0;
        int amount = 100;
        int percentage = 50;
        while (amount > 50 && amount < 150) {
            int options = betnum.nextInt(2);
            switch (options) {
                case win:
                    amount = amount + percentage;
                    break;
                case lose:
                    amount = amount - percentage;
                    break;
            }

        }
        System.out.println("amount left:" + "" + amount);
    }

    static void method4() {
        final int win = 1;
        final int loss = 0;
        int amount = 100;
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            int options = betnum.nextInt(2);
            switch (options) {
                case win:
                    amount = amount + bet;
                    System.out.println("its win day");
                    break;
                case loss:
                    amount = amount - bet;
                    System.out.println("its loss day");
                    break;
            }
            sum = sum + amount;

        }
        System.out.println("the amount left:" + "" + sum);
    }

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }
}