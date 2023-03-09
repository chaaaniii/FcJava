// Q. 두 개의 정수를 사칙연산(+,-,*,/)하여 출력하는 JavaSE프로그램을 만들어보자.
public class FourArithmetic {
    public static void main(String[] args) {
        int a, b;
        a = 12;
        b = 2;
        // 아래 코드에서 '+' 는 더하기가 아니라 결합을 의미한다.
        System.out.println("a + b = "+(a+b));
        System.out.println("a - b = "+(a-b));
        System.out.println("a * b = "+(a*b));
        System.out.println("a / b = "+(a/b));
    }
}
