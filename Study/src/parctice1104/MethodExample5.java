package parctice1104;

public class MethodExample5 {

	public static void main(String[] args) {
		Account obj  = new Account("777-777-77777777", "�ִ��", 10);
		try {
		int amount = obj.withdraw(100000);
		System.out.println("�����:" + amount);
		
		}catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}

}
