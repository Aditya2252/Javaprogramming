public class inheritance {
    public static void main(String[] args) {
        Animal d=new Animal();
        d.eat();
        Dog g = new Dog();
        g.bark();
        g.eat();
        mammle m=new mammle();
        m.legs();

    }
    
}
class Animal{
    String color;
    void legs(){
        System.out.println("animal have 2 or four legs");
    }
    void skin(){
        System.out.println("this is skin color");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
};

class Dog extends Animal{
    String piceas;
    void bark(){
        System.out.println("Animal is Bark");
    }
}

class mammle extends Dog{
    String count;
    void father(){
        System.out.println("Mammle have a feather");
    }
}