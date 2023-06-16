package striver.binarysearch;

public class findminInsorted {
    
    public static void main(String[] args) {
        int nums[] = { 4, 5, 1, 2, 3 };
        int left = 0;
        int right = nums.length - 1;
        int minvalue = Integer.MAX_VALUE;

        while (left <= right) {
            if (nums[left] < nums[right]) {
                minvalue = Math.min(minvalue, nums[left]);
                break;
            }

            int mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid]) {
                minvalue = Math.min(minvalue, nums[left]);
                left = mid + 1;
            } else {
                minvalue = Math.min(minvalue, nums[mid]);
                right = mid - 1;
            }
        }
        System.out.println("Minimum value of this array = " + minvalue);
    }
}


