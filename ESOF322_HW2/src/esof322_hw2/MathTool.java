package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * abstract class for implementing sorting strategies
 */
public abstract class MathTool {
    sortBehavior sortBehavior; // variable to hold the sorting behavior being implemented in the interfaces
    
    public MathTool(){
        
    }
    
    public void mathSort(){
        sortBehavior.mathSort();
    }
    
   public void setSortStrategy(sortBehavior sb){
       sortBehavior = sb;
   }
}
