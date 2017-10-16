package practice1017;

public class FruitVendingMachine {

	public static void main(String[] args) {
		char coin = 'K';
		switch (coin) {
		case 'A':
			System.out.println("사과");
			break;
		case 'P':
			System.out.println("배");
			break;
		case 'G':
			System.out.println("포도");
			break;
		case 'K':
			System.out.println("키위");
			break;
		default:
			System.out.println(coin);
			break;
		}
	}

}
