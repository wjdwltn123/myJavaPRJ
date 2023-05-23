package Practice;

import java.util.*;

public class Prac1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> List = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            List.add(num);
        }

        for(int i = 0; i < List.size(); i ++) {
            for (int k = i+1; k < List.size(); k++) {
                if (List.get(i) == List.get(k)) {
                    List.remove(k);
                    k--;
                }
            }
        }
        System.out.printf("합계는 ");
        for (int num: List) {
            System.out.printf(num + " ");
        }
        System.out.printf("입니다.");
    }
}

