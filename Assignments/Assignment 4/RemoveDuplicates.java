
public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = "geeksforgeeks";
        String ans = "";

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);

            if(!isPresent(c,ans)){ // Add characters which are not present in ans variable
                ans+=c;
            }
        }

        System.out.println(ans);
    }

    private static boolean isPresent(char c,String ans) {
        boolean flag = false;
        for (int i = 0; i < ans.length(); i++) {
            if(ans.charAt(i) == c){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
