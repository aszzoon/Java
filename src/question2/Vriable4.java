package question2;

import java.util.Scanner;

// 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자.
public class Vriable4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값을 입력해봐");
        // 키보드를 통해 입력한 정숫값을 받는다.
        int x = stdIn.nextInt();
        System.out.println(x+"를 입력했습니다.");
    }
}
