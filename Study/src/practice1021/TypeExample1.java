package practice1021;

public class TypeExample1 {

	public static void main(String[] args) {
		double smallest1 = 4.9e-324; //double Ÿ���� ���� �̼��� +��
		double smallest2 = -4.9e-324; //double Ÿ�̺��� ���� �̼��� -��
		double result1, result2;
		result1 = smallest1 / 2.0; // ���� �̼��� +���� 2�� ������ ��
		result2 = smallest2 / 2.0; // ���� �̼��� -���� 2�� ������ ��
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}

}
