package chap9.part4.nested_interface;

public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("�޽����� �����ϴ�.");
	}
}
