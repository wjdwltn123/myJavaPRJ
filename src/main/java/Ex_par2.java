public class Ex_par2 { public static void main(String[] args) {
    int i = 2;
    int j = 1;
    while(i <= 9) {
        j = 1;
        while(j <= 9) {
            if(j == 1) {
                System.out.println(i + "단");
            }
            System.out.println(i + " x " + j + " = " + i*j);
            j++;
        }
        i++;
    }
}
}