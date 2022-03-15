package ch13.generics_queue;

public class GenQueue<T> implements IGenQ<T> {
	private T q[];
	private int putLoc, getLoc;

	public GenQueue(T[] aRef) {
		q = aRef;
		putLoc = getLoc = 0;
	}

	@Override
	public void put(T obj) throws QueueFullException {

		if (putLoc == q.length)
			throw new QueueFullException(getLoc);

		q[putLoc++] = obj;
	}

	@Override
	public T get() throws QueueEmptyException {

		if (getLoc == putLoc)
			throw new QueueEmptyException();

		return q[getLoc++];
	}
}
