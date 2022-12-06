public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {5,4,6,3,2,1,8};
        sort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }

    public static void sort(int[] nums, int low, int hi){
        if(low>hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            sort(nums, low, e);
            sort(nums, s, hi);
        }
    }


}
