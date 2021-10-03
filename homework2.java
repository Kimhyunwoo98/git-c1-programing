import java.util.Scanner;
//201710916 김현우
class Student{
    String name;
    String major;
    int hakbun;
    int telnum; // 전화번호

    public void setHakbun(int hakbun) {
        this.hakbun = hakbun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setTelnum(int t) {
        this.telnum = telnum;
    }
    public void info(int hakbun,String name, String major,String telnum) {

        System.out.println(hakbun+name+' '+major+' '+telnum.substring(0,3)+'-'+telnum.substring(3,7)+'-'+telnum.substring(7,11));
    }
}
class homework2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요. : ");
        String info = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요. : " );
        String info2 = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요. : ");
        String info3 = sc3.nextLine();

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.print("첫번쨰 학생 : ");
        String[] words = info.split("\\s");
        String[] words2 = info2.split("\\s");
        String[] words3 = info3.split("\\s");
        int hakbun;
        String telnum;
        String name;
        String major;

        hakbun = Integer.parseInt(words[0]);
        telnum = words[3];
        name = words[1];
        major = words[2];
        Student allinfo = new Student();
        allinfo.info(hakbun,name,major,telnum);

        System.out.print("두번쨰 학생 : ");
        hakbun = Integer.parseInt(words2[0]);
        telnum = words2[3];
        name = words2[1];
        major = words2[2];
        Student allinfo2 = new Student();
        allinfo2.info(hakbun,name,major,telnum);
        System.out.print("세번쨰 학생 : ");
        hakbun = Integer.parseInt(words3[0]);
        telnum = words3[3];
        name = words3[1];
        major = words3[2];
        Student allinfo3 = new Student();
        allinfo3.info(hakbun,name,major,telnum);


    }
}