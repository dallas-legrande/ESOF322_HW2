package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Class to run the merge sort algorithm that inherits from the MathTool abstract class
 */
public class MTool extends MathTool{
    // Method for running the sort behavior of MTool
    // Default sorting method is merge sort
    
    public void MTool(){
        sortBehavior = new mergeSort();
        
        // adding print methods per assignment specs
        System.out.println("sortBehavior = new mergeSort()");
    }
}
    

