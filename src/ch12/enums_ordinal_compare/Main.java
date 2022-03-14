package ch12.enums_ordinal_compare;

public class Main {

	public static void main(String[] args) {
		Transport tp, tp2, tp3;

//		obtain all ordinal values
		System.out.println("Here are all Transport constants and their ordinal values");

		for (Transport t : Transport.values())
			System.out.println(t + " - " + t.ordinal());

		tp = Transport.AIRPLANE;
		tp2 = Transport.TRAIN;
		tp3 = Transport.AIRPLANE;

		System.out.println();

//		demonstrate compareTo
		if (tp.compareTo(tp2) < 0)
			System.out.println(tp + " comes before " + tp2);

	}

}
