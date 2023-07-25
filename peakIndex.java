package striver.binarysearch;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/  

// so if you are already confronted the ar had a fight with the question something like peak elment ar the mountain array then this is just a extende version of tht question
// the only diff here is if we applly the typical binary search then it might give us the out of bound error for the mid element  so for tht we need to take care of 
// the indeices and in the if else if and else if i had covered all the edge cases so  lelo lo muh mein (apna pen ^_^) and lets dive deep into the explantion of this peak index problem



public class peakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;

        while (low <= high) {
            // till now levaraging myself with the typical binary searchhh
          
            int mid = (low + high) / 2; // typical binary searchhh
            if (mid > 0 && mid < n - 1) { // so the game starts from her  we will check for this edge if the mid > 0 and in between the array then only we will enter into this loop
                // and then that typical peak element or peak index algorithm ( ek algo padho ar uske sath 4 question freee (●'◡'●) happy me after applying this algorithm in this question )
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] > arr[mid - 1]) { // typical binary search
                    low = mid + 1;

                } else { // typical binary searchhh
                    high = mid - 1;

                }
            } else if (mid == 0) { // yes and the anotherr edge cases of the mid == 0 then check for the mid + 1 if it is greater then return it or go for the mid + 1
                if (arr[mid] > arr[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (mid == n - 1) { // and if the mid == n -1 or in the last index then check if the arr[mid] is greater then the [mid + 1] 
                if (arr[mid] > arr[mid - 1]) {
                    return mid;
                } else { // if not then check then move high = mid - 1;
                    high = mid - 1;
                }
            }
        }
        return -1;

    }
    // i hope u got the intution and the algorithm behind this problem if not to mujhe to smjh mein aa gya hai mene ye khud k liye likha tha TUM GAND MARAAAOO !!
    //  hasne wala emojiii,hasne wala emojii   (●'◡'●))

    //acchha pdhna hai kya okk to pehle array pdho then binary search and then watch this video 
    video link : https://youtu.be/cXxmbemS6XM
    // in this video striver bhaiya explains the peak element algorithm which is same for this question and some more questions which are desgined same in this patternn
    // approach is same bt this algo just reduces the code length..
    bg- music = https://youtu.be/jyZsX8OyrmQ

    public static int peakIndexInMountainArray1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 6, 2 };
        int ans = peakIndexInMountainArray1(arr);
        System.out.println("the peak index of the arrray is : " + ans);
    }

}
