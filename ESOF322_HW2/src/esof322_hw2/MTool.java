package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 */
public class MTool extends MathTool{
    
    public void MTool(){
        sortBehavior = new mergeSort();
    }
}
    

