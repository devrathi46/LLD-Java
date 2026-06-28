package package2;

import package1.Animal;

public class Dog extends Animal {
    public void test(){
        System.out.println(type);
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.test();
    }
}
