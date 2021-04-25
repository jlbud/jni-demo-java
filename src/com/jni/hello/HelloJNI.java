package com.jni.hello;

public class HelloJNI {
    public native static String hello(String name);

    static {
        System.load("./so.so");
    }

    public static void main(String[] args) {
        HelloJNI.hello("name");
    }
}
