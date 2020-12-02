package com.bjtu.redis;

public class StringUtil {
    private StringUtil(){
    }

    public static boolean hasLength(String str){
        return str != null && !str.equals("");
    }
}
