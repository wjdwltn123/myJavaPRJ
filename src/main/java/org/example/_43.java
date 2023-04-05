package org.example;

public class _43 {public static void main(String[] args) {
    int a,b;

    for ( a=2, b=1; a < 10; b++) {
        if ( b > 9){
            b =1;
            a++;}
        if ( a < 10 ){
            System.out.printf("%d x %d = %d \n",a,b,a*b);
        }
    }
}
}