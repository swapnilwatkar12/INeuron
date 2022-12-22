public class Palindrome {
    public static void main(String[] args) {
        String word = "2552";
        boolean flag = true;

        for (int i = 0; i < word.length()/2; i++) {
            char beginningChar = word.charAt(i);
            char endingChar = word.charAt(word.length()-i-1);

            if(beginningChar != endingChar){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println("String " + word + " is palindrome.");
        }
        else{
            System.out.println("String " + word + " is not palindrome.");
        }
    }
}
