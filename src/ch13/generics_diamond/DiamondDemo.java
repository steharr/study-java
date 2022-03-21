package ch13.generics_diamond;

public class DiamondDemo {

	public static void main(String[] args) {

		TwoGen<Integer, String> tgOb = new TwoGen<>(42, "Test");
		TwoGen<Integer, String> tgOb2 = new TwoGen<>(42, "Test");

System.out.println(	tgOb.isSame(tgOb2));
		
	}
}
