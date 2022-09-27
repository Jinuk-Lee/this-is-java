package chap9.part5.anonymous_implements;

public class Anonymous {
	RemoteControl field = new RemoteControl() { // 필드 선언과 초기값 대입
		@Override
		public void turnOn(){
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff(){
			System.out.println("TV를 끕니다.");
		}
	};
	void method1(){
		RemoteControl localVar = new RemoteControl() { // 로컬 변수 선언과 초기값 대입
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	void method2(RemoteControl rc){
		rc.turnOn();
	}
}



