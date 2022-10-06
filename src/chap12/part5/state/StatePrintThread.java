package chap12.part5.state;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ����: " + state);
			if(state == State.NEW) {
				targetThread.start();
			}
			if(state == State.TERMINATED) {
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

