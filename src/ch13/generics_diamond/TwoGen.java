package ch13.generics_diamond;

public class TwoGen<T, V> {
	T ob1;
	V ob2;

	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	public boolean isSame(TwoGen<T, V> o) {
		if (ob1 == o.ob1 && ob2 == o.ob2)
			return true;
		else
			return false;
	}
}
