package ch13.generics_interfaces;

public class MyClass<T> implements Containment<T> {
	private T[] arrayRef;

	public MyClass(T[] o) {
		arrayRef = o;
	}

	public boolean contains(T o) {
		for (T x : arrayRef)
			if (x.equals(o))
				return true;
		return false;
	}
}
