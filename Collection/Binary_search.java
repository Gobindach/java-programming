
package Collection;

import static java.lang.System.*;
import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		// Binary search requires a sorted array
		int[] numbers = {12, 24, 35, 47, 58, 69, 80, 91};
		int target = 69;
		
		int resultIndex = performBinarySearch(numbers, target);
		
		if (resultIndex == -1) {
			out.println("Element " + target + " not found in the array.");
		} else {
			out.println("Element " + target + " found at index: " + resultIndex);
		}
	}

	/**
	 * Performs iterative binary search on a sorted integer array.
	 * @param arr Sorted array to search in
	 * @param target Value to look for
	 * @return The index of the target if found, otherwise -1
	 */
	public static int performBinarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			// Find the middle element
			int mid = low + (high - low) / 2;
			
			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid;
			}
			
			// If target is greater, ignore left half
			if (arr[mid] < target) {
				low = mid + 1;
			} 
			// If target is smaller, ignore right half
			else {
				high = mid - 1;
			}
		}
		
		// Target was not present in the array
		return -1;
	}
}
