import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            System.out.printf("정수를 입력하세요:");
            num[i] = sc.nextInt();
            sum += num[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d 입니다. \n",sum);
        }
    }
}

