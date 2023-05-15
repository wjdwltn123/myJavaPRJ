package Practice;
import java.util.*;

public class Prac14 {
    //  Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아
    //  5만원권, 1만원권, 5천원권, 1천원권, 500원, 100원, 50원, 1원 으로 각 몇개씩 변환 되는지를 출력하라.
    public static void main(String[] args) {
        int num, res, res2, res3, res4, res5, res6, res7, res8, res9, totalNum;

        System.out.print("입력할 값을 선택하세요 :");
        Scanner s = new Scanner(System.in);

        num = s.nextInt();
        totalNum = num;

        res = totalNum / 50000;
        totalNum = totalNum - (res * 50000);
        System.out.println("5만원 갯수 = " + res);

        res2 = totalNum / 10000;
        totalNum = totalNum - (res2 * 10000);
        System.out.println("1만원 갯수 = " + res2);

        res3 = totalNum / 5000;
        totalNum = totalNum - (res3 * 5000);
        System.out.println("5천원 갯수 = " + res3);

        res4 = totalNum / 1000;
        totalNum = totalNum - (res4 * 1000);
        System.out.println("1천원 갯수 = " + res4);

        res5 = totalNum / 500;
        totalNum = totalNum - (res5 * 500);
        System.out.println("500원 갯수 = " + res5);

        res6 = totalNum / 100;
        totalNum = totalNum - (res6 * 100);
        System.out.println("100원 갯수 = " + res6);

        res7 = totalNum / 50;
        totalNum = totalNum - (res7 * 50);
        System.out.println("50원 갯수 = " + res7);

        res8 = totalNum / 10;
        totalNum = totalNum - (res8 * 10);
        System.out.println("10원 갯수 = " + res8);

        res9 = totalNum / 1;
        totalNum = totalNum - (res9 * 1);
        System.out.println("1원 갯수 = " + res9);

    }
}
