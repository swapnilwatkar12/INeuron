// Code for maximum occuring character


public class MaximumChar {
    public static void main(String[] args) {
        String word = "GeeksforGeeks";
        
        int[] arr = new int[128];

        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i)]++;
        }
        
        int max=0;
        int maxIdx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        } 
        char c = (char) maxIdx;
        System.out.println( c + " is most repeating character in " + word);
    }
}
