package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Driver class to run the strategy pattern
 */
public class ESOF322_HW2 {
    
    static int[] array = {1,37,7,9,44,26,5,82};
    
    public static void main(String[] args) {
        MathTool m = new Mathematica();
        m.mathSort(array);
        m.setSortStrategy(new mergeSort());
        m.mathSort(array);
        m.setSortStrategy(new bubbleSort());
        m.mathSort(array);
    }
    
}
