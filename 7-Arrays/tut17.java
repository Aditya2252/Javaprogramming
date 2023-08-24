public class tut17 {
    public static void main(String[] args) {
        String s="Aditya : is Good boy";

        String modified=s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(modified);

        String reverse=new StringBuilder(modified).reverse().toString();
        System.out.println(reverse); 
        if (s.equals(reverse)) {
            System.out.println("It is in palindrome");

            
        }else{
            System.out.println("It is not in palindrome");
        }
    }
    
}
