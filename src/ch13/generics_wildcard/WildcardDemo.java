package ch13.generics_wildcard;

public class WildcardDemo {

	public static void main(String[] args) {

		NumericFns<Integer> iOb = new NumericFns<Integer>(6);
		NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
		NumericFns<Long> lOb = new NumericFns<Long>(5L);

		if (iOb.absEqual(dOb)) {
			System.out.println(true);
		}
	}

}
