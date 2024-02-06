package com.myblog3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 extends TestClass2{
    public TestClass1(int a) {
       super(a);
        a=a+13;


        System.out.println(a);
    }

    public static void main(String[] args) {
        int b=12;
        TestClass1 test=new TestClass1(b);
//        Predicate<Integer> val= x->x%2==0;
        //        boolean result = val.test(11);
//        System.out.println(result);


//        Predicate<String> val=str-> str.equals("mike");
//        boolean result = val.test("locky");
//        System.out.println();


//        List<Integer> numbers = Arrays.asList(10, 45, 20, 46, 4, 15, 30, 50);
//        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);
//        List<Integer> numbers = Arrays.asList(15,40,20,48,40, 54, 68, 78, 89);
//        List<Integer> evennumbers= numbers.stream().filter(n->n%2== 0).collect(Collectors.toList());
//        System.out.println(evennumbers);

//        List<String> str = Arrays.asList("David", "Morris", "Elbert", "Walter", "Derrick");
//        List<String> data1 = str.stream().filter(n -> n.startsWith("D")).collect(Collectors.toList());
//        System.out.println(data1);

//
//        List<String> str = Arrays.asList("Morkel", "Louis", "Jeffery", "Jack", "jassy", "Jhon");
//        List<String> marry = str.stream().filter(stm -> stm.startsWith("J")).collect(Collectors.toList());
//        System.out.println(marry);

//        List<String> str = Arrays.asList("jeffery", "Louis", "jeffery", "jack", "jassy", "Jhon");
//       List<String> marry = str.stream().filter(stm -> stm.equals("jeffery")).collect(Collectors.toList());
//       System.out.println(marry);
//        List<String> name = Arrays.asList("David", "Walter", "Jeffery", "Jack");

//Basic of Predicate Interface
//        Predicate<Integer>value=x->x%2==0;
//        boolean test = value.test(80);
//        System.out.println(test);


//        Basic of Function Functional Interface
//        Function<String ,Integer> val=str->str.length();
//        Integer leng = val.apply("Maddswrry");
//        System.out.println(leng);


//  Function<Integer,Integer> ki=str->str+10;
//        Integer num = ki.apply(10);
//        System.out.println(num);


//        List<Integer> val = Arrays.asList(10, 89, 89, 54, 78, 98, 32);
//        List<Integer> result = val.stream().map(n -> n + 10).collect(Collectors.toList());
//        System.out.println(result);
//        List<String> val = Arrays.asList("David", "Harry", "Jeffery", "Hanery", "Jack", "Tim", "Latham");
//        List<String> result = val.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//        System.out.println(result);

//        List<String> val = Arrays.asList("David", "Harry", "Jeffery", "Hanery", "Jack", "Tim", "Latham");
//        List<String> result = val.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
//        System.out.println(result);
//

//        List<Integer> val = Arrays.asList(15, 45,510, 45, 89, 51);
//        List<Integer> sop = val.stream().sorted().collect(Collectors.toList());
//        System.out.println(sop);
//
//        List<String> val = Arrays.asList("David", "Harry", "Jeffery", "Hanery", "Jack", "Tim", "Latham");
//        List<String> result = val.stream().sorted().collect(Collectors.toList());
//        System.out.println(result);


//        List<Integer> val = Arrays.asList(10, 32, 25, 35, 32, 25, 10, 48, 35, 90, 48);
//        List<Integer> collect = val.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> val = Arrays.asList(15, 25, 25, 65, 85, 65, 98, 85);
//        List<Integer> ios = val.stream().distinct().map(n -> n + 10).collect(Collectors.toList());
//        System.out.println(ios);
//        List<Integer> val = Arrays.asList(10, 25, 10, 35, 25, 35, 89, 78, 89, 78, 1, 5);
//        List<Integer> sortedist = val.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(sortedist);

        //Consumer Functional Interface
//        Consumer<Integer> result= number-> System.out.println(number);
//        result.accept(198);


//        List<String> result = Arrays.asList("David", "Walters", "Kim");
//        Consumer<String>val= number->System.out.println(number);
//        result.forEach(val);


//        Supplier Functional Interface

//Supplier<Integer> val=() -> new Random().nextInt(12);
//        Integer i = val.get();
//        System.out.println(i);

//        List<Employee> logins = Arrays.asList(
//                new Employee("mike", 40, "Banglore"),
//                new Employee("david", 80, "Mumbai"),
//                new Employee("tom", 25, "Pune"),
//                new Employee("walter", 10, "")
//        );


    }
}