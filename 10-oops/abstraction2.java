public class abstraction2 {
    public static void main(String[] args) {
        doctors d=new doctors();
        d.recerch();;
        
    }
    
}

abstract class  People{
    void eat(){
        System.out.println("People eat anything");
    }

    abstract void recerch();

}

class Scientist extends People{
    void recerch(){
        System.out.println("Scientist are recerch on various technology");

    }

}

class doctors extends People{
    void recerch(){
        System.out.println("dictor will be research on various illness");
    }
}
