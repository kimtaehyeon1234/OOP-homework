import java.util.Scanner;

public class Homework4 {
    static int gcd(int m, int n) {
        if (n == 0) {return m;}

        if (m <= n) {return gcd(m, n % m);}
        else {return gcd(n, m % n);}
    }

    static int gcd_1(int m, int n) {
        while (n != 0) {
            if (m == 0) {
                return n;
            }
            int sm = (m < n) ? m : n;
            int big = (m > n) ? m : n;
            m = sm;
            n = big % sm;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result1 = gcd(num1, num2);
        //int result2= gcd_1(num1, num2);

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result1);
        //System.out.printf("두 수의 최대공약수는 %d입니다.\n", result2);
    }
}