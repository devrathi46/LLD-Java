package CopyConstructor;

public class Main{

    public static void main(String[] args){

        Student s1=new Student("Dev",24,"M");

        //case 1: both point to the same heap.
        // Student s2=s1;
        // s2.name="Harsh";
        // System.out.println(s2.name);
        // System.out.println(s1.name);

        //case 2: a new heap is created for s3 object.
        Student s3=new Student();
        s3.name=s1.name;
        s3.age=s1.age;
        System.out.println(s3.name + " " + s3.age);
        s3.name="Harsh";
        s3.age=24;
        System.out.println(s1.name + " " + s1.age);
        System.out.println(s3.name + " " + s3.age);

    }

}