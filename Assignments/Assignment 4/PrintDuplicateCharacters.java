public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String word = "geeksforgeeks";
        String ans = "";

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);

            if(isPresent(word,ans,c,i)){
                ans+=c;
            }
        }

        System.out.println(ans);
    }

    private static boolean isPresent(String word,String ans,char c,int idx) {
        boolean flag1 = false;
        for (int i = idx+1; i < word.length(); i++) {  // Check if character is repeated in word
            if(word.charAt(i) == c){
                flag1 = true;
                break;
            }
        }

        boolean flag2 = true;
        for (int i = 0; i < ans.length(); i++) { // Check if character is present in ans variable
            if(ans.charAt(i) == c){
                flag2 = false;
            }
        }

        return (flag1 && flag2);
    }
}
