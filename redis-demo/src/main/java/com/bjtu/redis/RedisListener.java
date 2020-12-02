package com.bjtu.redis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RedisListener {
    private List<String> keys;

    public RedisListener(){
        keys = new ArrayList<>();
    }

    public RedisListener(int keyNumber){
        keys = new ArrayList<>(keyNumber);
    }

    public void listen(String key){
        keys.add(key);
    }

    public void listen(String[] keys){
        this.keys.addAll(Arrays.asList(keys));
    }

    public String[] getListeningKeys(){
        String[] keysArr = new String[keys.size()];
        return keys.toArray(keysArr);
    }
}
