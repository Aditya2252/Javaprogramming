public class tut22 {
    public static int calculateCount(String[] str){
        int count=0;

        for(int i=0;i<str.length;i++){
            for(int j=1;j<str[0].length();j++){
                if(str[j].charAt(i)<str[j-1].charAt(i)){
                    count ++;

                }

            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String str[]={"cba","daf","ghi"};
     int   result =calculateCount(str);
     System.out.println(result);

    }
    }
    
    

