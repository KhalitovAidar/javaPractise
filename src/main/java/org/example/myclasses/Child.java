package org.example.myclasses;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Child extends Parent{
    private int child;

    public Child(int someChild) {
        this.child = someChild;
    }

    @Override
    public String someMethod() {
        return "pedic";
    }
    public void lol () {
        System.out.println("lol");
    }
}

class Main
{
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.balances();

        runner.finished();
    }
}

class Runner {
    private final Account account1 = new Account();
    private final Account account2 = new Account();

    public void firstThread() {
        Random random = new Random();
            synchronized (account1){
                synchronized (account2) {
                    for(int i = 0; i < 10000; ++i) {
                        Account.transaction(account1, account2, random.nextInt(100));
                    }
                }
            }
    }

    public void secondThread() {
        Random random = new Random();

        synchronized (account2){
            synchronized (account1) {
                for(int i = 0; i < 10000; ++i) {
                    Account.transaction(account2, account1, random.nextInt(100));
                }
            }
        }
    }

    public void balances(){
        System.out.println("Account1: " + account1.getBalance());
        System.out.println("Account2: " + account2.getBalance());
    }
    public void finished() {
        System.out.println("Balances sum: " + (account1.getBalance()
                                            + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public static void transaction(Account account1, Account account2, int sum) {
        account1.balance -= sum;
        account2.balance += sum;
    }
}