package com.winterbe.java8.samples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClassLab {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::print);
        //You can traverse the stream only once you will get error when you execute line below
        stream.forEach(System.out::print);
        
        List<Integer> list
                = Arrays.asList(0, 2, 4);
        List<Integer> list1
                = Arrays.asList(6, 8, 10);
        List<List<Integer>> list2 = Arrays.asList(list, list1);
        //method to process flatmap
        list2.stream().map(Collection::stream).flatMap(e -> e).forEach(System.out::println);
        //limit method usage
        System.out.println("---------------------------------");
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("---------------------------------");
        //skip method usage, argument inside skip method starts from 1 and not from 0
        list.stream().skip(1).forEach(System.out::println);
        System.out.println("---------------------------------");
        //skip and limit method combined
        list.stream().skip(1).limit(1).forEach(System.out::println);
        
          //Three ways to create the stream
        System.out.println("-----1------");
        Stream<Integer> myStream1 = Stream.empty();
        myStream1.forEach(System.out::println);
        System.out.println("------2------");
        Stream<Integer> myStream2 = Stream.of(11, 12, 13);
        myStream2.forEach(System.out::println);
        List<Integer> numsList = Arrays.asList(11, 12, 13, 14, 15);
        System.out.println("-----3------");
        Stream<Integer> myStream3 = numsList.stream();
        myStream3.forEach(System.out::println);
        
        //Adding two list to stream
        List<Integer> list=Arrays.asList(11,12,13);
        List<Integer> list1=Arrays.asList(14,15,16);
        Stream<List<Integer>> stream=Stream.of(list,list1);
        
        //Adding two streams to stream using concat
        Stream<Integer> stream=Arrays.asList(11,12,13).stream();
        Stream<Integer> stream1=Arrays.asList(14,15,16).stream();
        Stream<Integer> stream2=Stream.concat(stream,stream1);
        
         //using stream iterate function
        Stream.iterate(11,e->e+1).limit(10).forEach(System.out::println);
        
        //Generate method to produce random stream
        Stream.generate(() -> (new Random()).nextInt(100))
                .limit(10)
                .forEach(System.out::println);
        
        //Reduce method with exmaple
        List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5);
        int sumResult1 = numsList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sumResult1);
        System.out.println("-------------------");
        int sumResult2 = numsList.stream().reduce(0, Integer::sum);
        System.out.println(sumResult2);
        System.out.println("-------------------");
        int mulResult = numsList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);
        System.out.println("-------------------");
        Integer lastElement = numsList.stream()
                .reduce((num1, num2) -> num2)
                .orElse(-1);
        System.out.println(lastElement);
        
        //count method
        long count= mylist.stream()
                .filter(num -> num%2!=0)
                .map(num -> num * num)
                .count();
        System.out.println(count);
        System.out.println("---------------------");
        //max method
        Optional<Integer> maxNum = mylist.stream()
                .filter(num -> num%2!=0)
                .map(num -> num * num)
                .max((num1, num2) -> num1.compareTo(num2));
        System.out.println(maxNum);
        maxNum.ifPresent(System.out::println);
        System.out.println("---------------------");
        //min method
        Optional<Integer> minNum = mylist.stream()
                .filter(num -> num%2!=0)
                .map(num -> num * num)
                .min((num1, num2) -> num1.compareTo(num2));
        System.out.println(minNum);
        minNum.ifPresent(System.out::println);
        System.out.println("---------------------");
        System.out.println("Done!!!");
    }
}
