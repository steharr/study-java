package ch12.enums_class;

public enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

	private int speed;

//	constructor
	private Transport(int s) {
		speed = s;
	}

	int getSpeed() {
		return speed;
	}
}
