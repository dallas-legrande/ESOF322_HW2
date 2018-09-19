package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Driver class to run the strategy pattern
 */
import java.util.*;

public class ESOF322_HW2 {
    
    static int[] array = {1,37,7,9,44,26,5,82};
    
    public static void main(String[] args) {
        MathTool m = new Mathematica();
        // adding print methods per assignment specs
        System.out.println("sortBehavior = new insertionSort()");
        m.mathSort(array);
        m.setSortStrategy(new mergeSort());
        // adding print methods per assignment specs
        System.out.println("sortBehavior = new mergeSort()");
        m.mathSort(array);
        System.out.println("Sorting numbers using merge sort");
        System.out.println(Arrays.toString(array));
        m.setSortStrategy(new bubbleSort());
        // adding print methods per assignment specs
        System.out.println("sortBehavior = new bubbleSort()");
        m.mathSort(array);
        System.out.println();
    }
    
}
