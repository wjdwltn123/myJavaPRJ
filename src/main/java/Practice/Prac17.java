package Practice;

import java.util.Scanner;

public class Prac17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int i,max;

        for (i=0 ;i<arr.length; i++)
        {
            arr[i] = s.nextInt();
        }
        max=arr[0];

        for (i=1; i<arr.length; i++)
        {
            if (max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.print(max);
    }
}
