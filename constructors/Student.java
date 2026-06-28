package constructors;

public class Student{
    String name;
    int age;

    Student(String name,int age){

        System.out.println(this.name + " "+ this.age);
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(this.name + " " + this.age);
    }

};