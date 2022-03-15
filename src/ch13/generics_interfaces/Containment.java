package ch13.generics_interfaces;

public interface Containment<T> {
// Tests if a specific item is contained within an object
	boolean contains(T o);
}
