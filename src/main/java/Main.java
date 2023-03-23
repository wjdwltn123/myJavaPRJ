import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 3 == 0 && a% 5 == 0) {
            System.out.println("3의 배수와 5의 배수를 둘다 만족합니다.");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("해당 조건을 만족하지 않습니다.");
        }
    }
}
