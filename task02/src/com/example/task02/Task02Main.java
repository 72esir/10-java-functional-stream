package com.example.task02;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {


        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);


    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n >16){
            throw new IllegalArgumentException("Введено некорректное значение");
        }
        IntStream intStream = IntStream
                .iterate(0, x -> (x + 1) % (int)Math.pow(2, n))
                .map(x -> x ^ (x >> 1));

        return intStream; // your implementation here
    }


}
