package chap9.part3.outterclass_ref;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}