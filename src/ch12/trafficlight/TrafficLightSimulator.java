package ch12.trafficlight;

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
				switch (tlc) {
				case GREEN:
					Thread.sleep(10000);
					break;
				case YELLOW:
					Thread.sleep(2000);
					break;
				case RED:
					Thread.sleep(12000);
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}

	synchronized void changeColor() {
		switch (tlc) {
		case GREEN:
			tlc = TrafficLightColor.YELLOW;
			break;
		case YELLOW:
			tlc = TrafficLightColor.RED;
			break;
		case RED:
			tlc = TrafficLightColor.GREEN;
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
