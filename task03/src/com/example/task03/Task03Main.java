package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3),
                Integer::compareTo,
                (min, max) ->
                        System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here

        if (stream == null || order == null || minMaxConsumer == null){
            throw new NullPointerException();
        }
        Iterator<? extends T> iterator = stream.iterator();
        if (!iterator.hasNext()){
            minMaxConsumer.accept(null, null);
        }
        else {
            T min = iterator.next();
            T max = min;


            while (iterator.hasNext()) {
                T curr = iterator.next();
                if (order.compare(curr, min) < 0) {
                    min = curr;
                } else if (order.compare(curr, max) > 0) {
                    max = curr;
                }
            }
            minMaxConsumer.accept(min, max);
        }
        /*Iterator<? extends T> iterator = stream.iterator();

        if (stream == null || order == null || minMaxConsumer == null) {
            throw new NullPointerException("Stream, comparator, or consumer is null");
        }
        boolean isEmpty = stream.findAny().isPresent();
        if (!isEmpty){
            minMaxConsumer.accept(null,null);
            return;
        }
        else{
            T min = iterator.next();
            T curr = iterator.next();
            T max = min;

            while (iterator.hasNext()) {

                if (order.compare(curr, min) < 0) {
                    min = curr;
                    curr = iterator.next();
                } else if (order.compare(curr, max) > 0) {
                    max = curr;
                    curr = iterator.next();
                }
                else {
                    curr = iterator.next();
                }
            }
            minMaxConsumer.accept(min,max);
        }*/
    }
}
