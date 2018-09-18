package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 */
public abstract class MathTool {
    sortBehavior sortBehavior;
    
    public MathTool(){
        
    }
    
    public void sort(){
        sortBehavior.mathSort();
    }
    
   public void setSortMethod(sortBehavior sb){
       sortBehavior = sb;
   }
}
