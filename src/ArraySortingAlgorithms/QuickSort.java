package ArraySortingAlgorithms;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22, 2, 4 };
        quickSort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int [] inputArray) { //overloaded quicksort method

        quickSort(inputArray, 0, inputArray.length - 1);

    }

    public static void quickSort(int [] inputArray, int lowIndex, int highIndex) {

        //base case
        if(lowIndex >= highIndex) return;

        //IDENTIFY PIVOT
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex; //generates random index within array bounds
        int pivot = inputArray[pivotIndex]; //uses randomly generated index value and assigns it as a pivot
        swap(inputArray, pivotIndex, highIndex); //sets the random index as the high index

        //PARTITIONING
        int leftPointer = partition(inputArray, lowIndex, highIndex, pivot);

        //recursive calls on left partition on right partitions
            quickSort(inputArray, lowIndex, leftPointer - 1); //left partition
            quickSort(inputArray, leftPointer + 1, highIndex); //right partition

    }

    private static int partition(int[] inputArray, int lowIndex, int highIndex, int pivot) {

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) { //continue until pointers meet

            while(inputArray[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(inputArray[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(inputArray, leftPointer, rightPointer); //swap values at both pointers
        }
        swap(inputArray, leftPointer, highIndex); //swap the left pointer value with the pivot value

        return leftPointer;
    }

    public static void swap(int [] inputArray, int index1, int index2){ //swamp method
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }


}
