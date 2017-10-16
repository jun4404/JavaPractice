package practice1017;

public class LuxuryHelloJava {
	public static void main(String ags[]) {
		printCharacter('*', 30);
		System.out.println("Hello, Java");
		printCharacter('-', 30);
	}
	static void printCharacter(char ch, int num) {
		for(int cnt = 0; cnt < num ; cnt++)
			System.out.println(ch);
		System.out.println();
	}
}
