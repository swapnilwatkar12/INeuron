

class Duplicates{
    public static void main(String[] args) {
        int[] arr = {10,20,10,30,40,50,60,20,1,1,10,30,50,40,15}; // dummy array,

        int[] ans = new int[arr.length];
        int ansPointer = 0;

        // add numbers in ans array which are repeated
        for (int i = 0; i < arr.length; i++) {
            
            if(isRepeated(arr,arr[i])){    //If number is repeated
                boolean flag = true;
                
                //Check whether element is present in ans array or not
                for (int j = 0; j < ansPointer; j++) {
                    if(arr[i] == ans[j]){
                        flag = false;
                    }
                }
                
                // If repeated element is not present in ans array then add it to ans array
                if(flag){
                    ans[ansPointer] = arr[i];
                    ansPointer++;
                }
            }
        }

        // Printing ans array
        for (int i = 0; i < ansPointer; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    // return number is repeated or not
    public static boolean isRepeated(int[] arr, int num){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                count++;
            }
        }
       
        if(count>=2){
            return true;
        }
        return false;
    }
}