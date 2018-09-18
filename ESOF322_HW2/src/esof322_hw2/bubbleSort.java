package esof322_hw2;

/**
 * Homework 2 ESOF 322
 * implementation of strategy pattern
 * Authors: Dallas LeGrande, Selene Smith
 * 
 * Class for implementing the sortBehavior of bubble sort
 * bubble sort isa sort behavior
 */
public class bubbleSort implements sortBehavior{
    public void mathSort(){
        System.out.println("Sorting numbers using bubble sort");
    }
    
    //actual bubble sort algoritm
    public void bubbleSort(int intArray[])

{

    int n = intArray.length;
    int temp = 0;

    for(int i=0; i < n; i++){
           for(int j=1; j < (n-i); j++){
                  if(intArray[j-1] > intArray[j]){
                         temp = intArray[j-1];
                         intArray[j-1] = intArray[j];
                         intArray[j] = temp;
                  }

          }
   }

}
}
