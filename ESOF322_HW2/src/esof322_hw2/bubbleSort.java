package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * Author of bubble sort: Arl Kheem Rey Galario - https://github.com/artimre098/BubbleSort/blob/master/bubbleSORT.java
 * 
 * Class for implementing the sortBehavior of bubble sort
 * bubble sort isa sort behavior
 */
public class bubbleSort implements sortBehavior{
    public void mathSort(int[] arr){
        System.out.println("Sorting numbers using bubble sort");
        
     int i, j , swap;
    
            for(i = 0; i < arr.length; i ++){
                
                for(j = 0; j < arr.length - 1  ;j++){
                    
                    if(arr[j] > arr[j+1]){
                        
                        swap = arr[j];        // place the bigger number to swap
                        arr[j] = arr[j+1];    // place the smaller number
                        arr[j+1] = swap;      
                    
                    
                    }
                }
            }
            
            //Display the sorted array
            for(int x = 0 ; x < arr.length ; x ++){
            System.out.print(arr[x] + ",");
            
            }
    }
    
    //actual bubble sort algoritm
    public void bubbleSort(int intArray[])

{


}
}
