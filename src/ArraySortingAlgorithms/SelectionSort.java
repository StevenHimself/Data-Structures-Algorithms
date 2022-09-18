package ArraySortingAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { //outer loop decrements from the unsorted partition as it gets sorted
            int largest = 0; //index for the largest value

                for(int i = 1; i <= lastUnsortedIndex; i++) { //inner loop checks for largest value through the unsorted partition
                    if(intArray[i] > intArray[largest]) { //compares the value in which the iteration is on with the current largest
                        largest = i; //if the value at index i is larger than the value at index largest, then index i becomes the new largest index
                    }
                }
            swap(intArray, largest, lastUnsortedIndex); //swap the largest value in this iteration with the value at the last unsorted index (the end)
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) { //simple swap method

        if(i == j) return; //if the values compared are the same return
        int temp = array[i]; // simple temp variable to hold one int to be swapped
        array[i] = array[j]; //assign value at index j to index i
        array[j] = temp; //reassign the empty index j with the value held at the temp variable

    }

}
