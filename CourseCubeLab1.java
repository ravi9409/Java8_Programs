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
    }
}
