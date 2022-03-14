package ch12.test4;

public enum TrafficLightColor {
	RED(10000), GREEN(2000), YELLOW(12000);

	private int duration;

	TrafficLightColor(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
}
