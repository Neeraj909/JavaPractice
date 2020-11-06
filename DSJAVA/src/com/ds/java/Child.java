package com.ds.java;

public class Child extends Parent{
    static{
        System.out.println("static block  child");
    }
    {
        System.out.println("not static block child ");
    }
    Child(){
        System.out.println("child Const");
    }
    public void m1(){
        System.out.println("Child m1");
    }
}
