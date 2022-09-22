package SortingAlgorithms;

public class ShellSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for(int gap = intArray.length / 2; gap > 0; gap /= 2) { //initializes gap and divides gap by 2 after first pass

            for(int i = gap; i < intArray.length; i++) { //After each comparison move up 1
                int newElement = intArray[i]; //the new element being compared

                int j = i; //traverse right to left during comparison

                while(j >= gap && intArray[j - gap] > newElement) { //Compare the two elements using the gap
                    intArray[j] = intArray[j - gap]; //shift the element gap spaces over to the right
                    j -= gap; //checks to see if there are any more elements to compare new element with until the front of the array

                }

                intArray[j] = newElement; //insert new element to its correct position
            }

        }

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

}
