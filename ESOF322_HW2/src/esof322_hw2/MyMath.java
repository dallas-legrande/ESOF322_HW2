package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 */
public class MyMath extends MathTool{
    
    public MyMath(){
        sortBehavior = new bubbleSort();
    }
    
}
