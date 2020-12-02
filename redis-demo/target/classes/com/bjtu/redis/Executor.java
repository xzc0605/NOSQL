package com.bjtu.redis;

import redis.clients.jedis.Transaction;
import java.util.List;

public class Executor {
    private Transaction transaction;
    public Executor(Transaction transaction){
        this.transaction = transaction;
    }

    public List<Object> execute(){
        return transaction.exec();
    }
}
