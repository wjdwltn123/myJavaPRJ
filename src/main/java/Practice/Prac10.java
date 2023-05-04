package Practice;

import java.util.Scanner;

public class Prac10 {
     public static int machine(int button) {
         System.out.printf("\n 동전을 넣는다. ");
         System.out.printf("\n 마실 음료를 선택한다. ");

         switch (button) {

             case 1:
                 System.out.println("\n # 3.콜라를 선택한다  ");
                 break;
             case 2:
                 System.out.println("\n # 3.사이다를 선택한다. ");
                 break;
             case 3:
                 System.out.println("\n # 3.환타를 선택한다. ");
                 break;
             default:
                 System.out.println("\n # 3.잘못된것을 선택했다");
         }
         return 0;
     }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int drink;
        int bag;

        System.out.println("어떤 음료를 선택하겠습니까?");
        drink = s.nextInt();

        bag = machine(drink);

    }
}
