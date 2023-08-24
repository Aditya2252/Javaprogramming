public class abstraction {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.eat();
        f.walk();
    dog g=new dog();
    g.walk();


    }
}

 abstract class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
    abstract void walk();
}

class Fish extends Animal{
    void walk(){
        System.out.println("Fish cannot be walk it will be swim");
    }
}

class dog extends Animal{
    void walk(){
        System.out.println("Dog will be walk on two legs");
    }
}
