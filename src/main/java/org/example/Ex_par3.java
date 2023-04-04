package org.example;

public class Ex_par3 {
    public static void main(String[] args) { //psvm 기본 문장
        int a,b; //인트로 a,b 변수 설정
        for (a =2, b=1; a<10; b++) { //
    if (b > 9) {
        b = 0;
        a++;

    }
     if (b == 9){
        System.out.printf("%d x %d =%d \n", a,b, a*b);
    }
        }

    }
}
