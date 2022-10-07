package chap12.exercise.exam10;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("음악을 재생합니다..");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
}
