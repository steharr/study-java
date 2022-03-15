package ch13.generics_queue;

@SuppressWarnings("serial")
public class QueueFullException extends Exception {
	private int size;

	public QueueFullException(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "\nQueue is full. Max size is " + size;
	}

}
