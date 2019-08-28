package homework;
/* Timothy Cote Chapter 1 Exercise 14 */

public class Lanterns {
	public static void main(String[] args) {
		writeStar5();
		writeStar9();
		writeStar13();
		writeBlank();
		writeStar5();
		writeStar9();
		writeStar13();
		writeGlass();
		writeStar13();
		writeStar5();
		writeStar9();
		writeStar13();
		writeBlank();
		writeStar5();
		writeStar9();
		writeStar13();
		writeStar5();
		writeGlass();
		writeGlass();
		writeStar5();
		writeStar5();
	}
	public static void writeStar5() {
		System.out.println("    *****    ");
	}
	public static void writeStar9() {
		System.out.println("  *********  ");
	}
	public static void writeStar13() {
		System.out.println("*************");
	}
	public static void writeBlank() {
		System.out.println();
	}
	public static void writeGlass() {
		System.out.println("* | | | | | *");
	}
}

