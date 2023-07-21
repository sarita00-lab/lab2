import java.util.Arrays;

public class ArrayDeletionsLab {

    public static int[] deleteElementByIndex(int[] arr, int index) {
        
        if (index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid index. Index must be within the bounds of the array.");
        }

        
        int[] updatedArr = new int[arr.length - 1];

        
        int updateIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                updatedArr[updateIndex] = arr[i];
                updateIndex++;
            }
        }

        return updatedArr;
    }

    public static int[] deleteElementByValue(int[] arr, int value) {
        
        int indexToDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                indexToDelete = i;
                break;
            }
        }

        
        if (indexToDelete == -1) {
            return arr;
        }

        
        return deleteElementByIndex(arr, indexToDelete);
    }

    
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        

        System.out.println("Original Array: " + Arrays.toString(myArray));

        int indexToDelete = 2;
        int[] updatedArrByIndex = deleteElementByIndex(myArray, indexToDelete);
        System.out.println("Updated Array after deletion by index: " + Arrays.toString(updatedArrByIndex));

        int valueToDelete = 4;
        int[] updatedArrByValue = deleteElementByValue(myArray, valueToDelete);
        System.out.println("Updated Array after deletion by value: " + Arrays.toString(updatedArrByValue));

        System.out.println("Test cases");
        int[] arr1 = {1, 2, 3, 4, 5};
        int indexToDelete1 = 3;
        int[] updatedArrByIndex1 = deleteElementByIndex(arr1, indexToDelete1);
        System.out.println("Updated Array 1 after deletion by index: " + Arrays.toString(updatedArrByIndex1));


        int[] arr2 = {1, 2, 2, 3, 2, 4, 5};
        int valueToDelete2 = 2;
        int[] updatedArrByValue2 = deleteElementByValue(arr2, valueToDelete2);
        System.out.println("Updated Array 2 after deletion by value: " + Arrays.toString(updatedArrByValue2));

        int[] arr3 = {1, 2, 3, 4, 5};
        int valueToDelete3 = 6;
        int[] updatedArrByValue3 = deleteElementByValue(arr3, valueToDelete3);
        System.out.println("Updated Array 3 after deletion by value (not found): " + Arrays.toString(updatedArrByValue3));

    }
}
