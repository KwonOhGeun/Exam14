import java.util.Scanner;

public class Exam14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //숫자를 입력받아 숫자가0보다 크면 "양수' 작으면 "음수"  둘다 아니면 "0"  으로 출력해보자
        int a;
        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if (a > 0) {
            System.out.println("양수입니다.");
        } else if (a == 0) {
            System.out.println("0입니다");
        } else {
            System.out.println("음수입니다.");
        }
    }
}