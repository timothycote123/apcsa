package homework;
/* Timothy Cote Chapter 1 Exercise 13 */
public class StarFigures {
	public static void main(String[] args) {
		writeStar5();
		writeStar2();
		writeStar1();
		writeStar2();
		writeBlank();
		writeStar5();
		writeStar2();
		writeStar1();
		writeStar2();
		writeStar5();
		writeBlank();
		writeStar1();
		writeStar1();
		writeStar1();
		writeStar5();
		writeStar2();
		writeStar1();
		writeStar2();
	}
	public static void writeStar5() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void writeStar2() {
		System.out.println(" * * ");
	}
	public static void writeStar1() {
		System.out.println("  *  ");
	}
	public static void writeBlank() {
		System.out.println();
	}
}

