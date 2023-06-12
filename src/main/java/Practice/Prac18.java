package Practice;
import java.util.*;

public class Prac18 {
    public static void main(String[] args) {
        String[] Subject = {"JAVA", "C", "SQL", "HTML"};
        int[] Score = {77, 66, 33 ,88};

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.print("과목명을 입력하세요");
           String name = s.next();

           for(int i =0; i<Subject.length; i++) {
               if (Subject[i].equals(name)) {
                   System.out.println("과목명은 " + Subject[i] + "점수는" + Score[i] );

               }
           }
           if(name.equals("멈춰")) {
               break;
           }
        }
        s.close();



    }
}
