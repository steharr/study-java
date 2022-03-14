package ch12.enums_value;

public class Main {

	public static void main(String[] args) {
		Transport tp;
		System.out.println("All transport constants");

//		Use values()
		Transport allTransports[] = Transport.values();
		for (Transport t : allTransports)
			System.out.println(t);

		System.out.println();

//		Use valueof()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);

	}

}
