package ArraySortingAlgorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray);

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    private static void mergeSort(int [] inputArray) {

        int inputLength = inputArray.length;

        //base case
        if(inputLength < 2) return; //if an array has a single element or there is no array return

        //SPLITTING PHASE
        int midIndex = inputLength / 2; //find the midpoint the array

        int[] leftHalf = new int[midIndex]; //creates left partition
        int[] rightHalf = new int[inputLength - midIndex]; //creates right partition

        for(int i = 0; i < midIndex; i++){ //populates left partition with elements from the input array
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputLength; i++){ //populates right partition with elements from the input array
            rightHalf[i - midIndex] = inputArray[i];
        }

        //recursive calls on left halves/right halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //MERGING PHASE
        merge(inputArray, leftHalf, rightHalf);

    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        //i iterates left, j iterates right, k iterates merge
        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize) {

            if (leftHalf[i] <= rightHalf[j]) { //if element in left partition less/equal then copy into merge array and increment i
                inputArray[k] = leftHalf[i];
                i++;
            }
            else{
                inputArray[k] = rightHalf[j];//if element in right partition less/equal then copy into merge array and increment j
                j++;
            }
            k++;
        }
        while(i < leftSize) { //while leftover elements in left half copy them to merged array
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) { //while leftover elements in right half copy them to merged array
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }


    }

}
