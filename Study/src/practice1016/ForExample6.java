package practice1016;

public class ForExample6 {
	public static void main(String args[]) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int a;
		int sum = 0;
		for (int cnt = 3; cnt < 7; cnt++) {
			a = arr[cnt];
			System.out.println(a);
			sum += a;
		}
		System.out.println(sum);
	}
}
