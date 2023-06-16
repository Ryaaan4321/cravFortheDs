package striver.binarysearch;

public class searcchinrotaedarr2 {
    public static boolean search2(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return true;

            // Base case when all three pointers are pointing to the same element.
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            // and rest of the code is same like the last binary search algo in the rotated arr..!

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, 2, 3, 3, 3, 3, 3};
        int target = 2;
        boolean found = search2(nums, target);
        System.out.println(found);
    }
}
