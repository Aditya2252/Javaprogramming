public class tut4 {
    public static void printletters(String name) {
        for (int i = 0; i < name.length(); i++) {
             System.out.println(name.charAt(i));
        }
    }

    public static void main(String[] args) {
        String name = "Aditya";
        printletters(name);
    }
    

}
