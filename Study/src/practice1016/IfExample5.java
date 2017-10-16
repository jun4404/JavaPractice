package practice1016;

public class IfExample5 {
	public static void main(String args[]) {
		int num = 74;
		if(num < 10)
			System.out.println("num의 값은 10 미만입니다.");
		else if(num<100)
			System.out.println("num의 값은 10이상 100미만입니다.");
		else if(num<1000)
			System.out.println("num의 값은 100이상 1000미만입니다.");
		else 
			System.out.println("num의 값은 1000이상입니다.");
		
	}
}
