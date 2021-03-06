package com.company.march03assessment.task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Question_6 {
    private static List<Integer> filterEvenFromList(List<Integer> list) {
        return list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterEvenFromList(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

}
