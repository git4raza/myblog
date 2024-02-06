package com.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass2 extends Testclass3{
    public TestClass2(int b) {
        super(b);
        System.out.println(b);
    }

    public static void main(String[] args) {
//        List<Employee2> emo=Arrays.asList(
//                new Employee2("David",39,"Banglore"),
//                new Employee2("Henary",30,"Banglore"),
//                new Employee2("Sam",26,"Delhi"),
//                new Employee2("Donald",26,"Mumbai"));
//
//        Map<Integer, List<Employee2>> collect = emo.stream().collect(Collectors.groupingBy(e-> e.getAge()));
//        for(Employee2 emis:emo){
//            List<Employee2> emso = collect.get(emis.getAge());
//            for (Employee2 x:emso){
//                System.out.println(x.getName());
//                System.out.println(x.getCity());
//                System.out.println(x.getAge());
//
//            }
//        }

    }
}
