package ch13.generics;

// T is type parameter
// will be replaced by the real type
public class Gen<T> {
	private T ob; // decl object of type T

	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}
