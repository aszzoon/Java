package question2;

import java.util.Scanner;

// 구의 겉넓이와 부피를 구하 프로그램을 작성하자
public class Variable7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final double PI = 3.1416;

        System.out.println("구의 겉넓이와 부피를 구해보자.");
        System.out.println("우선 구 반지름을 입력해라");
        double x = stdIn.nextDouble();

        System.out.println("구의 겉넓이 = " + 4*PI*(x*x));
        System.out.println("구의 부피 = " + 4/3*PI*(x*x*x));
    }
}
