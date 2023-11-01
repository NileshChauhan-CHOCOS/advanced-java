package org.chocos.advancedjava.concurrency.executor;

public class ExecutorMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new DirectExecutor().execute(()-> System.out.println(Thread.currentThread().getName()));
        new ThreadPerTaskExecutor().execute(()-> System.out.println(Thread.currentThread().getName()));
        System.out.println(Thread.currentThread().getName());
        NumberPrinter printer = new NumberPrinter(30);
        Runnable r1 = printer::print;
        Runnable r2 = printer::print;
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
