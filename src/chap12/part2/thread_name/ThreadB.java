package chap12.part2.thread_name;

public class ThreadB extends Thread {	
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "�� ����� ����");
		}
	}
}

