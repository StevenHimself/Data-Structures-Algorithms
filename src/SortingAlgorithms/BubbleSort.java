package SortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { //decrements from the unsorted partition as array gets sorted
            for(int i = 0; i < lastUnsortedIndex; i++) { //traverses through the unsorted partition
                if (intArray[i] > intArray[i+1]) //compared the two elements
                    swap(intArray, i, i+1); //swaps if current position is greater than neighbor
            }
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    //swap method
    public static void swap(int[] array, int i, int j) {

        if(i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
