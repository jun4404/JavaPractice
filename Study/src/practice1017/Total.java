package practice1017;

public class Total {
	public static void main(String args[]) {
		double arr[] = {97.5, 100, 79.5};
		double total = 0;
		for(double num : arr) {
			total += num;
		}
		System.out.println(total);
	}
}
