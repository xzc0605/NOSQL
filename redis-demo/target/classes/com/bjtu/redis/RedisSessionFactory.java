package com.bjtu.redis;
import com.bjtu.redis.StringUtil;

public class RedisSessionFactory {
    private String host;
    private int port;
    private String password;

    public RedisSessionFactory(){

    }
    public RedisSession openSession(){
        if(port == 0)
            if(!StringUtil.hasLength(password))
                return new RedisSession(host);
            else
                return new RedisSession(host,password);
        return new RedisSession(host,port,password);
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
