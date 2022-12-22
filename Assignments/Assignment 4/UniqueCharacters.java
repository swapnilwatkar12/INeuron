// Code to find if string contains all unique characters


public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcde@!";
        
        unique(str);
    
    }

    private static void unique(String str) {
       
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println(str + " does not contain unique characters");
                    return;
                }
            }
        }
        System.out.println(str + " contains unique characters");

        
    }
}
