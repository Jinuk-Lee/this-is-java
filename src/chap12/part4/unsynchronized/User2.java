package chap12.part4.unsynchronized;

public class User2 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
