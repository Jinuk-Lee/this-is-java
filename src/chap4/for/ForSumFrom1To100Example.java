package chap4.For;

//1부터 100까지의 합을 구하는 코드
public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= -100; i++) {
            sum += i;
        }

        System.out.println("1~100 합 :" + sum);
    }
}
