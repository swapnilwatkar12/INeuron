

class PangramCode{
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over a lazy dog";
       
        pangram(str);
    }

    private static void pangram(String str) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>96 && str.charAt(i)<123){  // Only for small alphabets
                arr[str.charAt(i) - 97]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 1){
                System.out.println(str + " is not a pangram");
                
                return;
            }
        }
        System.out.println(str + " is a pangram");
    }
}