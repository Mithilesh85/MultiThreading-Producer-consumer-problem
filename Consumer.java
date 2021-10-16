package com.mithilesh.producer.consumer;

public class Consumer extends Thread {

    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    //    Company c=new Company();
    public void run() {

        while (true) {
            try {
                c.consume_item();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }

    }

}
