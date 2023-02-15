package com.winterbe.java8.samples.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CourseCubeLab1 {
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
    }
}
