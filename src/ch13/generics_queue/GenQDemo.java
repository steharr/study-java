package ch13.generics_queue;

public class GenQDemo {

	public static void main(String[] args) {

//		create an integer que
		Integer iStore[] = new Integer[10];
		GenQueue<Integer> q = new GenQueue<Integer>(iStore);

		Integer iVal;

		System.out.println("Demonstrate a que of integers");

//		putting
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + i + " to q");
				q.put(i);
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

//		getting
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Getting next integer from que");
				iVal = q.get();
				System.out.println(iVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

//		create an double que
		Double dStore[] = new Double[10];
		GenQueue<Double> q2 = new GenQueue<Double>(dStore);

		Double dVal;

		System.out.println("Demonstrate a que of doubles");

//		putting
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + (double) i / 2 + " to q");
				q2.put((double) i / 2);
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();

//		getting
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Getting next integer from que");
				dVal = q2.get();
				System.out.println(dVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();
	}

}
