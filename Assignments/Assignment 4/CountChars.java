
/*
 *   Count no. of consonents, vowels, specialCharacters in a string
*/

public class CountChars {
    public static void main(String[] args) {

        String word = "12!!GeeksforGeeks!!34";

        int noOfconsonents = consonents(word);
        int noOfVowels = vowels(word);
        int noOfSpecialChars = specialChars(word);

        System.out.println("Number of consonents are " + noOfconsonents);
        System.out.println("Number of vowels are " + noOfVowels);
        System.out.println("Number of special characters are " + noOfSpecialChars);
    }

    private static int consonents(String word) {
        int count =0;
        final String consonent = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            for (int j = 0; j < consonent.length(); j++) {
                if(c == consonent.charAt(j)){
                    count++;
                    break;
                }
            } 
        }
        return count;
    }

    private static int vowels(String word) {
        int count =0;
        final String vowel = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            for (int j = 0; j < vowel.length(); j++) {
                if(c == vowel.charAt(j)){
                    count++;
                    break;
                }
            } 
        }
        return count;
    }

    private static int specialChars(String word) {
        int count =0;
        
        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i);
            
            if( ((c>64) && (c<91)) || ((c>96) && (c<123)) ){
                continue;
            }
            else{
                
                count++;
            }

        }
        return count;
    }

}
