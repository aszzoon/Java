package question2;

import java.util.Scanner;

// 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하자.
public class Variable6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("삼각형 밑변을 입력해라");
        double x = stdIn.nextDouble();

        System.out.println("이번엔 삼각형 높이를 입력해라");
        double y = stdIn.nextDouble();

        System.out.println("삼각형의 넓이 = "+ (x*y)/2);
    }
}
