package com.bjtu.redis.jedis;

import org.junit.Test;

import com.bjtu.redis.RedisSession;
import com.bjtu.redis.RedisSessionFactory;
import com.bjtu.redis.RedisSessionFactoryBuilder;
import com.bjtu.redis.TimeEnum;
import redis.clients.jedis.Jedis;

public class JedisInstanceTest {

    /**
     * 基本使用
     */
    @Test
    public void test1() {
        RedisSessionFactory factory = new RedisSessionFactoryBuilder()
                .build("192.168.0.1", "xzccc24");
        RedisSession session = factory.openSession();
        String value = session.getJedis().get("name");
        System.out.println(value);
    }

    @Test
    public void test3() {
        RedisSessionFactory factory = new RedisSessionFactoryBuilder()
                .build("192.168.0.1", "xzccc24");
        RedisSession session = factory.openSession();
        String value = session.selectString(0, "name");
        System.out.println(value);
    }

    @Test
    public void test4() {
        RedisSessionFactory factory = new RedisSessionFactoryBuilder()
                .build("192.168.0.1", "xzccc24");
        RedisSession session = factory.openSession();
        session.setDataExpire("name", 10, TimeEnum.SECOND);
    }

    @Test
    public void test5() {
        RedisSessionFactory factory = new RedisSessionFactoryBuilder()
                .build("192.168.0.1", "xzccc24");
        RedisSession session = factory.openSession();
        session.insertString("name", "xxx", true);
        session.insertString("name", "kslive@yeah.net", false);
        System.out.println(session.selectString(0, "name"));
    }

    @Test
    public void test6() {
        RedisSessionFactory factory = new RedisSessionFactoryBuilder()
                .parseConfig("redis.properties").build();
        RedisSession session = factory.openSession();
        String value = session.selectString(0, "name");
        System.out.println(value);
        System.out.println(session.getStringLength("name"));
        System.out.println(session.getAndSet("name", "xzc"));
        System.out.println(session.getMultiString("name", "email"));
    }



}
