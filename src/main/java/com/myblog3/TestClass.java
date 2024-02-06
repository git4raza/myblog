package com.myblog3;


public class TestClass{
    public static void main(String[] args) {
        TestClass tst=new TestClass();
        int val = tst.test();
        System.out.println(val);
      }
    public int test(){
        SampleTest smp=new SampleTest();

        int sop = smp.test1();
        return sop;

    }
}

