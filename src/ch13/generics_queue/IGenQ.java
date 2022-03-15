package ch13.generics_queue;

public interface IGenQ<T> {
// 	puts an item in the que
	void put(T ch) throws QueueFullException;

//	gets an item from the que
	T get() throws QueueEmptyException;
}
