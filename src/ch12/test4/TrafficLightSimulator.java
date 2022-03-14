package ch12.test4;

public class TrafficLightSimulator implements Runnable {
	private TrafficLightColor tlc; // holds traffic light color
	private boolean stop = false; // true stops simulation
	private boolean changed = false; // true when light change

	public TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
	}

	public TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(tlc.getDuration());
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}

	synchronized void changeColor() {
		if (tlc.ordinal() < 2) {
			tlc = TrafficLightColor.values()[tlc.ordinal() + 1];
		} else {
			tlc = TrafficLightColor.values()[0];
		}
		changed = true;
		notify();
	}

	synchronized void waitForChange() {
		try {
			while (!changed)
				wait(); // wait for the light to change
			changed = false;
		} catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

//	return current color
	synchronized TrafficLightColor getColor() {
		return tlc;
	}

//	stop the traffic light
	synchronized void cancel() {
		stop = true;
	}
}
