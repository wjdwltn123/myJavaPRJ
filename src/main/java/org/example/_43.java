package org.example;

public class _43 {
    public static void main(String[] args) {

        int j = 1;
        for (int i = 2; i < 10; j++) { // i = 2 10일때 멈춤
            if (j < 10) { // j가 10미만일때 진행된다
                System.out.printf("%d x %d = %d\n", i, j, i * j); // 2 x 1 ... 9 2x9까지 된다.
            }
            if (j == 9) {
                j = 1; // j가 9일때 j 1로 변하고 아래행으로 간다.
                System.out.println("\n"); // 다음행으로 진행된다
                i++; // i에 1더해진다.
            }
        }
    }
}