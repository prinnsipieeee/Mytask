public class Reftype{
    public void fly(String s){
        System.out.println("hello");
    }
    public void fly(Object t){
        System.out.println("object ");
    }
    public static void main(String[] args) {
        Reftype r = new Reftype();
        r.fly("test");
        r.fly(56);       
    }
}