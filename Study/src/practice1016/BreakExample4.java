package practice1016;

public class BreakExample4 {
	public static void main(String args[]) {
		int arr[] = { 435, 88, 67, 32, 88, -1, 6, 12, 7, 8, 45, 11 };
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] == -1)
				break;
			System.out.println(arr[a]);
		}
	}
}
