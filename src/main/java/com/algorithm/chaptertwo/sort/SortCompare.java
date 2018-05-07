package com.algorithm.chaptertwo.sort;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author chenlixin at 2016年4月27日 下午6:52:35
 */
public class SortCompare {

    public static double time(String algorithm, Comparable[] array) {
        Stopwatch timer = new Stopwatch();
        if (algorithm.equals("ShellSort")) {
            ShellSort.sort(array);
        }
        if(algorithm.equals("Insertion")) {
            InsertionSort.sortEnhance(array);
        }
        return timer.elapsedTime();
    }
    
    public static double timeRandomInput(String algorithm, int loopTime, int len) {
        double totalTime = 0;
        Double [] array = new Double[len];
        for (int i = 0; i < loopTime; i++) {
            for (int j = 0; j < len; j++) {
                array[j] = StdRandom.uniform();
            }
            totalTime += SortCompare.time(algorithm, array);
        }
        return totalTime;
    }
    
    public static void main(String[] args) {
        String first_alg = "ShellSort";
        String second_alg = "Insertion";
        
        int loopTime = 1000;
        int len = 1000;
        double first_alg_time = SortCompare.timeRandomInput(first_alg, loopTime, len);
        double second_alg_time = SortCompare.timeRandomInput(second_alg, loopTime, len);
        System.out.printf("%.1f times \n", first_alg_time / second_alg_time);
    }
}
