package org.chocos.advancedjava.concurrency.executor;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class print number from 1 to 20 inclusive
 */
public class NumberPrinter {
    private AtomicInteger count;
    private final int n;
    public NumberPrinter(){this.n = 1 << 4;}
    public NumberPrinter(int ln){
        this.count = new AtomicInteger(0);
        this.n = ln;
    }
    public void print(){
        int b;
        while((b = count.getAndIncrement()) <= n){
            System.out.println(Thread.currentThread().getName() + " --> " + b);
        }
    }
}
