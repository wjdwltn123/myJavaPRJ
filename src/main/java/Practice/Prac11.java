package Practice;

public class Prac11 {
    public static int hap(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] arhs) {

        for (int a = 2; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                System.out.printf("%2d * %2d = %2d \n",a,b,a * b);

            }
        }
    }
}

