package com.eatnuh.javaoop;

import com.eatnuh.javaoop.logic.BubbleSort;
import com.eatnuh.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> bubbleSort = new BubbleSort<>();

        System.out.println("[Resulst] " + bubbleSort.sort(Arrays.asList(args)));
    }
}
