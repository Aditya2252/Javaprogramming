public class tut12 {
    public static void main(String[] args) {
        String fruits[] ={"apple", "orange", "potato", "greaps"};
        String lage=fruits[0];
       for (int i=1;i<fruits.length;i++){
        if(lage.compareTo(fruits[i])<0){
            lage=fruits[i];
        }
       }
       System.out.println(lage);
       
    }
    
}
