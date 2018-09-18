package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Driver class to run the strategy pattern
 */
public class ESOF322_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathTool m = new Mathematica();
        m.mathSort();
        m.setSortStrategy(new mergeSort());
        m.mathSort();
        m.setSortStrategy(new bubbleSort());
        m.mathSort();
    }
    
}
