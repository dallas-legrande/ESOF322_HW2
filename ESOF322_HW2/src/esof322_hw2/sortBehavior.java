package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * delegates the mathSort() method to the classes that implement this behavior
 */
public interface sortBehavior {
    public void mathSort(int[] array);
}
