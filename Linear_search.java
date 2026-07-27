package Collection;

import static java.lang.System.*;

public class Linear_search {

	public static void main(String[] args)
	{
		int[] numbers = {12, 24, 35, 47, 58, 69, 80, 91};
		int target = 69;
		
		int resultIndex =linearSearch(numbers,target);
		if (resultIndex == -1)
		{
			out.println("Element " + target + " not found in the array.");
		} 
		else
		{
			out.println("Element " + target + " found at index: " + resultIndex);
		}
	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
