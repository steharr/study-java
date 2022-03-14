package ch13.generics_bound;

public class NumericFns<T extends Number> {
	private T num;

	public NumericFns(T n) {
		num = n;
	}

	double reciprocal() {
		return 1 / num.doubleValue();
	}

	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}
