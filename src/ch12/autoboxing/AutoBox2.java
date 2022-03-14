package ch12.autoboxing;

public class AutoBox2 {
	public static void m(Integer v) {
		System.out.println("m() recieved " + v);
	}

	public static int m2() {
		return 10;
	}

	public static Integer m3() {
		return 99; // autobox 99 into an Integer
	}

	public static void main(String[] args) {
//		pass to m(). Because m() has an Integer
//		parameter, the int value is boxed
		m(199);

		Integer iOb = m2();
		System.out.println("Return value from m2 is " + iOb);

		int i = m3();
		System.out.println("Return value from m3 is " + i);

//		using math sqrt, iOb gets unboxed and its value promoted to double
		iOb = 100;
		System.out.println("Square root of iOb is " + Math.sqrt(iOb));
	}

}
