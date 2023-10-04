public class Main {
	static boolean isPangramString(String s) {  
        if (s.length() < 26)  
             return false;  
        else {  
             for (char ch = 'a'; ch <= 'z'; ch++) {  
                  if (s.indexOf(ch) < 0) {  
                       return false;  
                  }  
             }  
        }  
        return true;  
   }

      public static void main(String[] args) {  
           String s = "abcdefghijklmnopqrstuvwxyZ";  
           System.out.println("Is given String Pangram ? : "  
                     + isPangramString(s.toLowerCase()));  
      }  
        
 } 