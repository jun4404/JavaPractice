package parctice1104;

public class ConstrExample3 {

	public static void main(String[] args) {
		SubscriberInfo obj;
		obj = new SubscriberInfo();
		printSubscriberInfo(obj);
		
	}

	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println(); //�� �ٲ� ���� ���		
	}

}
