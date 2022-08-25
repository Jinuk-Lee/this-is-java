package chap6.field;

public class CarExample {
	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ� �� ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}
}
