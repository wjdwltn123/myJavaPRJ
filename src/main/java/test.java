import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"번쨰 숫자를 입력하세요. :");
            int num = scanner.nextInt();

            boolean a=false;
            for (int j = 0; j < count; j++) {
                if (nums[j] == num) {
                   a= true;
                    break;
                }
            }

            if (!a){
                nums[count] = num;
                count++;
            }
        }

        System.out.print("저장된 값은 ");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]);
            if (i != count - 1) {
                System.out.print(",");
            }
        }
        System.out.println("입니다.");
    }
}
