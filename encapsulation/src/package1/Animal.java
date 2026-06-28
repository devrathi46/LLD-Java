package package1;

public class Animal{
    private String secret="DNA code";
            String species="Mammal";
    protected String type="Animal";
    public String name="Generic Animal" ;      

    public void show(){
        System.out.println(secret);
    } 
    public static void main(String[] args){
        Animal a = new Animal();
        a.show();
        System.out.println(a.type);
    }
}
