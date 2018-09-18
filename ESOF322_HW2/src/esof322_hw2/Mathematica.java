package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Class to run the insertion sort algorithm that inherits from the MathTool abstract class
 */
public class Mathematica extends MathTool{
    // Method for running the sort behavior of MTool
    // Default sorting method is insertion sort
    
    public Mathematica(){
        sortBehavior = new insertionSort();
    }
}
