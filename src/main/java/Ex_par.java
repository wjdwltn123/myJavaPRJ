public class Ex_par {
    public static void main(String[] args) {
        int i, k;

        for(i = 1; i <= 2; i++) {
            for (k = 2; k <= 9; k++) {
                System.out.printf("%3dx%d=%2d",k, i, k*1);
            }
            System.out.printf("\n");
        }
    }
}
