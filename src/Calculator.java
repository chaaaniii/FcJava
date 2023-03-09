//자바는 객체지향언어이기 때문에 클래스 단위로 코딩을 한다.
//시작, 메인 클래스가 되기 위해서는 main(){ } 메서드를 추가해 줘야 한다.
public class Calculator {
    // main(){       } 메서드
    // main을 입력시 자동완성을 시켜준다.
    public static void main(String[] args) {
        // Q. 두 개의 정수를 더하여 출력하는 자바 프로그램을 만들어 보자.
        int a, b, sum;
        a = 1;
        b = 1;
        sum = a + b;

        //출력코드는 sout를 입력시 자동완성을 시켜준다.
        System.out.println(sum);
    }
}
