import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
        String id;
        String pw;
        boolean run = true;
        int n = 1;
        while(run){
            System.out.println("Id와 password를 입력해주세요");
            n++;
            System.out.print("id : ");
            id = i.nextLine();
            if(!id.equals("myId")) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            } else{
                System.out.print("password : ");
                pw = i.nextLine();
                if(!pw.equals("myPass")){
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                }else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    run = false;
                }
            }
        }
    }
}
