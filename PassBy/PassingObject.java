package PassBy;

public class PassingObject{
    static void change(Student s){
        s.name="Harsh";
    }
    public static void main(String[] args){
        Student s1=new Student("Dev",24);
        change(s1);
        System.out.println(s1.name);
    }
}