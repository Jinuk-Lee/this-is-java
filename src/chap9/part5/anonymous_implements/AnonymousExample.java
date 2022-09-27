package chap9.part5.anonymous_implements;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.turnOn();
        anony.method1();
        anony.method2(
                new RemoteControl() { // 메소드의 매개값으로 사용
                    @Override
                    public void turnOn() {
                        System.out.println("SmartTV를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("SmartTV를 끕니다.");
                    }
                }
        );
    }
}