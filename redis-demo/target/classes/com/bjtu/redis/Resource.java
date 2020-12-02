package com.bjtu.redis;
import java.io.InputStream;

public class Resource {
    private Resource(){
    }

    public static InputStream getResourceAsStream(String path){
        return Resource.class.getClassLoader()
                .getResourceAsStream(path);
    }
}
