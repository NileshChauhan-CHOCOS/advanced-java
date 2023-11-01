package org.chocos.advancedjava.concurrency.executor;

import org.springframework.util.Assert;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor {
    @Override
    public void execute(Runnable r){
        Assert.notNull(r, "runnable cannot be null");
        r.run();
    }
}
