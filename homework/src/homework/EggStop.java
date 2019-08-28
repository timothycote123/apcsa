package homework;
/* Timothy Cote Chapter 1 Exercise 15 */
public class EggStop {
	public static void main(String[] args) {
		writeLine();
		writeLine2();
		writeLine2();
		writePlusline();
		writeBlank();
		writeLine();
		writeStop();
		writeLine2();
		writeBlank();
		writeLine();
		writePlusline();
	}
	public static void writeLine() {
		System.out.println("  _______   ");
		System.out.println(" /       \\ ");
		System.out.println("/         \\");
	}
	public static void writeLine2() {
		System.out.println("\\         /");
		System.out.println(" \\       /");
		System.out.println("  \\_______/");
	}
	public static void writePlusline() {
		System.out.println("+---------+");
	}
	public static void writeBlank() {
		System.out.println();
	}
	public static void writeStop() {
		System.out.println("|   Stop   |");
	
	}
}
