public class polymorphism {
    public static void main(String[] args) {
        calculator cal=new calculator();
        System.out.println(cal.sum(5, 10));
        System.out.println(cal.sum(10.11f, 14.22f));
        System.out.println(cal.sum(100, 500, 300));
        dog d=new dog();
        d.eat();
        
        
    }
    
}
class Animal{
    String name;
    void eat(){
        System.out.println("eat everything");
    }
}

class dog extends Animal{
    void eat(){
        System.out.println("Eat only dog food");
    }
}

class calculator{
    int sum(int a,int b){
        return a+b;

    }
    float sum(float a,float b){
        return a+b;
    }
    double sum(double a,double b,double c){
        return a+b;
    }
}