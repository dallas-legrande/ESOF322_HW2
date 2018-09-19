package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * Author of insertion sort algorithm: Arl Kheem Rey Galario - https://github.com/artimre098/InsertionSort-in-Java/blob/master/MyInsertionSort.java
 * 
 * Class for implementing the sortBehavior of insertion sort
 * insertion sort isa sort behavior
 */
public class insertionSort implements sortBehavior{
    public void mathSort(int[] input){
        System.out.println("Sorting numbers using insertion sort");
        int key;  
        int i;
        int j; //the number of items sorted so far
        
        for ( j = 1; j < input.length ; j++) { // start with 1 not 0
            key = input[j];
            
            
            for (i = j-1; (i > -1) && ( input [i] > key ); i -- ) { // smaller values moving up
                
                input [i+1] = input [i];
                
            }
            
            input[i+1] = key; // put the key in its proper location
    }
        
        // Display the sorted Array
     for (j = 0; j < input.length ; j++) {
           
         System.out.print(input[j] +"," );
      
    }
     System.out.println();
    }
}
