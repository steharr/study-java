package ch13.generics_queue;

@SuppressWarnings("serial")
public class QueueEmptyException extends Exception {
	@Override
	public String toString() {
		return "\nQueue is empty";
	}

}
