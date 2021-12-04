import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

class Homework9 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new FileInputStream("C:\\Users\\dinor\\Desktop\\file.txt")); // 바탕화면에 텍스트 파일 위치
            String s = sc.next();
            Scanner i = new Scanner(new FileInputStream("C:\\Users\\dinor\\Desktop\\file.txt")); // 바탕화면에 텍스트 파일 위치
            Scanner p = new Scanner(new FileInputStream("C:\\Users\\dinor\\Desktop\\file.txt")); // 바탕화면에 텍스트 파일 위치
            String id;
            String pw;
            FileReader reader = new FileReader("C:\\Users\\dinor\\Desktop\\file.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            boolean run = true;
            int n = 1;
            while (run) {
                System.out.println("Id와 password를 입력해주세요");
                n++;
                System.out.print("id : ");
                id = i.nextLine();
                if (!id.equals("myId")) {
                    System.out.println(i);
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println(i);
                    System.out.print("password : ");
                    pw = i.nextLine();
                    if (!pw.equals("myPass")) {
                        System.out.print(p);
                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                    } else {
                        System.out.print(p);
                        System.out.println();
                        System.out.println("id와 비밀번호가 일치합니다.");
                        run = false;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}