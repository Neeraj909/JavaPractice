package com.ds.java;

public class Parent {
    static{
       System.out.println("static block parent ");
   }
   {
       System.out.println("not static block  paretnt");
   }
   Parent(){
       System.out.println("Praent Const ");
   }
   public void m1(){
       System.out.println("parent m1");
   }
 
}


