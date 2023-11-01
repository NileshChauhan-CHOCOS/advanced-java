package org.chocos.advancedjava.concurrency.executor;

import org.springframework.util.Assert;

import java.util.concurrent.Executor;

public class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable r){
        Assert.notNull(r, "runnable should not be null");
        new Thread(r).start();
    }
}
