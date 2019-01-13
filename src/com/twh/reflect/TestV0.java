package com.twh.reflect;

// v0 版本
import java.lang.reflect.Method;

public class TestV0 {
    public static void target(int i) {
        new Exception("#" + i).printStackTrace();
    }

    public static void main(String[] args) throws Exception {
        Class<?> klass = Class.forName("com.twh.reflect.TestV0");
        Method method = klass.getMethod("target", int.class);
        method.invoke(null, 0);
    }
}