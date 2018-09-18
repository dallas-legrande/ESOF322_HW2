package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Class to run the bubble sort algorithm that inherits from the MathTool abstract class
 */
public class MyMath extends MathTool{
    // Method for running the sort behavior of MTool
    // Default sorting method is bubble sort
    
    public MyMath(){
        sortBehavior = new bubbleSort();
        
        // adding print methods per assignment specs
        System.out.println("sortBehavior = new bubbleSort()");
        
    }
    
}
