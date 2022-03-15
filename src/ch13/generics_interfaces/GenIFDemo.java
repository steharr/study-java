package ch13.generics_interfaces;

public class GenIFDemo {

	public static void main(String[] args) {
		Integer x[] = { 1, 2, 3 };

		MyClass<Integer> ob = new MyClass<>(x);

		if (ob.contains(2))
			System.out.println("2 in ob");
		else
			System.out.println("2 not in ob");

		if (ob.contains(5))
			System.out.println("5 in ob");
		else
			System.out.println("5 not in ob");

//		Following is illegal because ob is an Integer containment
//		if (ob.contains(2.2))
//			System.out.println("2.2 in ob");
	}

}
