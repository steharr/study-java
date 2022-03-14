package ch12.enums_class;

public class Main {

	public static void main(String[] args) {
		Transport tp;

//		display all transports and speeds
		System.out.println("Typical airplane speed is " + Transport.AIRPLANE.getSpeed() + "mph \n");

//		display all transports and speeds
		System.out.println("All transport speeds:");
		for (Transport t : Transport.values())
			System.out.println(t + " typical speed is " + t.getSpeed() + " mph ");
	}

}
