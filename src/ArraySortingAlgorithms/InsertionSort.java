package ArraySortingAlgorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) { //assumes the 1st index is sorted (start at index 1)
            int newElement = intArray[firstUnsortedIndex]; //the value in question for insertion
            int i; //keeps track of the index of where to insert the new element

                for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) { //continues running for as long front of the array and new element is less than value being compared to
                    intArray[i] = intArray[i - 1];  //shift the element being compared to new element to the right
                }
                intArray[i] = newElement;
        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
