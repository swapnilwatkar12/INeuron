public class AnagramCode {
    public static void main(String[] args) {
        String str1 = "tac";
        String str2 = "cat";

        if(str1.length() != str2.length()){
            System.out.println(str1 + " and "+ str2 + " are not anagrams.");
        }
        else{
            anagram(str1,str2);
        }
    }

    private static void anagram(String str1, String str2) {
        int[] arr = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            int num1 = str1.charAt(i) - 97;     // Only for small alphabets
            int num2 = str2.charAt(i) - 97;

            arr[num1]++;
            arr[num2]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.println(str1 + " and "+ str2 + " are not anagrams.");
                return;
            }
        }
        System.out.println(str1 + " and "+ str2 + " are anagrams.");
    }
}
