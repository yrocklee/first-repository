import java.util.Arrays; // This is required!
// add some comments here

public class DemoSearch {
  public static void main(String[] args) {
    int[] testArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // Sorted array for binary search
    int target = 90; // Element to search for

    System.out.println("Test Array: " + Arrays.toString(testArray) + "\n");

    // Testing linear search
    System.out.println("Linear Search: ");
    int linearResult = linearSearch(testArray, target);
    if (linearResult == -1) {
      System.out.println("Linear Search: Target " + target + " not found in the array.");
    } else {
      System.out.println("Linear Search: Target " + target + " found at index: " + linearResult);
    }

    // Testing binary search
    System.out.println("\nBinary Search: ");
    int binaryResult = binarySearch(testArray, target);
    if (binaryResult == -1) {
      System.out.println("Binary Search: Target " + target + " not found in the array.");
    } else {
      System.out.println("Binary Search: Target " + target + " found at index: " + binaryResult);
    }
  }

  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        System.out.println("Steps taken by linear search: " + (i + 1));
        return i; // Return the index of the target element
      }
    }
    System.out.println("Steps taken by linear search: " + array.length);
    return -1; // Return -1 if the target is not found
  }

  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    int steps = 0;

    while (left <= right) {
      steps++;
      int mid = left + (right - left) / 2;

      if (array[mid] == target) {
        System.out.println("Steps taken by binary search: " + steps);
        return mid; // Return the index of the target element
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    System.out.println("Steps taken by binary search: " + steps);
    return -1; // Return -1 if the target is not found
  }
}
