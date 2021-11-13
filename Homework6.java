class Course{
    public String code;
    public String name;
    Course(String c,String n){
        code = c;
        name = n;
    }

}
class OfflineCourse extends Course{
    OfflineCourse(String c, String n) {
        super(c, n);
        System.out.println("Code: "+code+", Name: "+name+", Type:Offline");
    }
}
class OnlineCourse extends Course{
    OnlineCourse(String c, String n){
        super(c,n);
        System.out.println("Code: "+code+", Name: "+name+", Type:Online");
    }
}




public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201","Object Oriented Progranming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012","C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
