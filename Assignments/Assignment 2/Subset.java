public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,4,5,7};
        int[] subArr = {4,5,7};
        if(subset(arr,subArr)){
            System.out.println("subarray is subset of array");
        }
        else{
            System.out.println("subarray is not an subset of array");
        }

    }

    private static boolean subset(int[] arr, int[] subArr) {
        for (int i = 0; i < arr.length; i++) {
            if(subArr[0] == arr[i]){
                boolean flag = true;
                for (int index = 1; index < subArr.length; index++) {
                    if(i+index >= arr.length){
                        flag = false;
                        break;
                    }

                    if(subArr[index] != arr[i+index]){
                        flag = false;
                    }
                }
                if(flag){
                    return true;
                }
            }
        }
        return false;
    }
}
