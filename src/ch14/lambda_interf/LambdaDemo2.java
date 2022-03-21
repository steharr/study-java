package ch14.lambda_interf;

public class LambdaDemo2 {

	public static void main(String[] args) {

		NumericTest isFactor = (n, d) -> (n % d) == 0;

		if (isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");

		if (isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");

//		change up the function interface with new lambda expression
		NumericTest lessThan = (n, m) -> (n < m);

		if (lessThan.test(10, 2))
			System.out.println("10 is not less than 2");

		if (lessThan.test(1, 3))
			System.out.println("1 is less than 3");

		System.out.println();

//		returns true if the absolute values of the arguments are equal
		NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

		if (absEqual.test(4, -4))
			System.out.println("Abs values of 4 and -4 are equal");

		System.out.println();

	}

}
