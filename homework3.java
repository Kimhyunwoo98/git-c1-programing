import java.util.Scanner;

class homework3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요 : ");  // m,n은 1이상의 정수이고, 두 수 사이에는 최대공약수가 반드시 존재한다.
        int m = sc.nextInt();
        int n = sc.nextInt();

        int d = gcd(m, n);	// 최대공약수

        System.out.println("\n두 수의 최대공약수는 " +d +"입니다."); // 최대공약수 출력


    }

    // 최대공약수 재귀 방식
    public static int gcd(int m, int n) {
        if (n == 0)
            return m;

        // GCD(m,n) = GCD(b, r)이므로 (r = m % n)
        return gcd(n, m % n);
    }
}