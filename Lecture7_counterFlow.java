class Student{
    String name;
    int marks;
    boolean checkPass(){
        if (marks>60){
            return true;

        }
        else {
            return false;
        }
    }
}

public class Lecture7_counterFlow {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.name="Shahid";
       s1.marks=80;
       Student s2=new Student();
       s2.name="Ram";
       s2.marks=30;
        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());
    }
}
