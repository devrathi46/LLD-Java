package PassBy;

public class PassingObjectReassigning {
    public static void change(Student s1){
        s1=new Student("Harsh",25);
    }
    public static void main(String[] args) {
        Student s1=new Student("Dev",24);
        System.out.println(s1.name);
    }
}
