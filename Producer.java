package com.mithilesh.producer.consumer;

public class Producer extends Thread {

    Company c;

    Producer(Company c) {
        this.c = c;
    }
//    Company c=new Company();

    public void run() {
        int i = 1;
        while (true) {

            try {
                c.produce_item(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            i++;
        }
    }

}
