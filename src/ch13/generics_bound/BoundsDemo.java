package ch13.generics_bound;

public class BoundsDemo {

	public static void main(String[] args) {

		NumericFns<Integer> iOb = new NumericFns<Integer>(5);

		System.out.println("Reciprocal of iOb " + iOb.reciprocal());
		System.out.println("Fraction of iOb " + iOb.fraction());

		System.out.println();

		NumericFns<Double> dOb = new NumericFns<Double>(5.25);

		System.out.println("Reciprocal of dOb " + dOb.reciprocal());
		System.out.println("Fraction of dOb " + dOb.fraction());

		System.out.println();
	}

}
