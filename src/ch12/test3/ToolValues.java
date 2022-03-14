package ch12.test3;

public class ToolValues {

	public static void main(String[] args) {

		for (Tools t : Tools.values()) {
			System.out.println("Tool:" + t + " Ordinal:" + t.ordinal());
		}
	}

}
