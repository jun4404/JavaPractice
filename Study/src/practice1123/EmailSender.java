package practice1123;

public class EmailSender extends MessageSender{
	String senderAddr;
	String emailBody;
	EmailSender(String title, String senderName, String senderAddr, String emailBody){
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
		
	}
	void sendMessage(String recipient) {
		System.out.println("----------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName + " " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
	}
	
}