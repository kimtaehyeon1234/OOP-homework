import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("정수를 입력하세요: ");
            int ans = sc.nextInt();
            sum += ans;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다. \n", sum);
        }
    }
}
