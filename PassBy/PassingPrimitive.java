package  PassBy;


public class PassingPrimitive{

    static void change(int x){
        x=100;
    }
    public static void main(String[] args){
            int a=10;
            change(a);
            System.out.println(a);
    }

}