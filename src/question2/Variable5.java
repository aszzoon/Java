package question2;

import java.util.Scanner;

//2개의 실수값을 입력받 그합과 평균을 구하 프로그램 작성하자
public class Variable5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("x 실수값을 입력해라");
        double x = stdIn.nextDouble();

        System.out.println("이번엔 y 실수값을 입력해라");
        double y = stdIn.nextDouble();

        System.out.println("합계 = "+(x+y));
        System.out.println("평균 = "+(x+y)/2);

    }
}
