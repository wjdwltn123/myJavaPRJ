package org.example;

public class Ex_par3 {
    public static void main(String[] args) {
        int a,b;
        for (a =2, b=1; a<10; b++) {
    if (b > 9) {
        b = 0;
        a++;
    }
    else {
        System.out.printf("%d x %d =%d \n", a,b, a*b);
    }
        }

    }
}
