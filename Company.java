package com.mithilesh.producer.consumer;

public class Company {
    int n;
    boolean b=false;
//    false for producer
//    true for consumer
    synchronized public void produce_item(int n)throws InterruptedException
    {
        if(b)
        {
            wait();
        }

        this.n=n;
        System.out.println("produced: "+this.n);
        b=true;
        notify();
    }
    synchronized public void consume_item() throws InterruptedException {
        if(!b)
        {
            wait();
        }
        System.out.println("consumed: "+n);
        b=false;
        notify();

    }
}
