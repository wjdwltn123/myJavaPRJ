import java.util.Scanner;
public class Ex_easy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("값을 입력하시오 :");
        a = s.nextInt();

        if ( a%3 == 0 ) {
            System.out.printf("3의 배수입니다! \n");
        }

    }
}
