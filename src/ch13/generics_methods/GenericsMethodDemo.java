package ch13.generics_methods;

public class GenericsMethodDemo {

	// Determines if the contents of two arrays are the same
	public static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {

		// if the array lengths differ -> false
		if (x.length != y.length)
			return false;

		for (int i = 0; i < x.length; i++) {
			if (!x[i].equals(y[i]))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {

		Integer nums[] = { 1, 2, 3, 4, 5 };
		Integer nums2[] = { 1, 2, 3, 4, 5 };
		Integer nums3[] = { 1, 2, 7, 4, 5 };
		Integer nums4[] = { 1, 2, 7, 4, 5, 6 };

		if (arraysEqual(nums, nums))
			System.out.println("nums equals nums");

		if (arraysEqual(nums2, nums))
			System.out.println("nums2 equals nums");

		if (arraysEqual(nums3, nums))
			System.out.println("nums3 equals nums");

		if (arraysEqual(nums4, nums))
			System.out.println("nums4 equals nums");

//		Create array of doubles
		Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

//		This wont compare because nums and dvals are not of the same type
//		if (arraysEqual(nums, dvals))
//			System.out.println("nums equals dvals");

	}

}
