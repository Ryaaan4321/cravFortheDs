package aryanhere.Striver;

public class findLArg2 {
    public static void main(String[]args){
        int []arr1 = {3,5,6,9,0,2,8,130};
        int secondLargest1 = findSecondLargestElement(arr1);
        System.out.println("The Second Largest Element is " + secondLargest1);

        int []arr2 = {5,8,9,12,89,76,91};
        int secondLargest2 = findSecondLargestElement(arr2);
        System.out.println("The Second Largest Element is " + secondLargest2);
    }

    static int findLargestElement(int[]arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondLargestElement(int[]arr){
        int largest = findLargestElement(arr);
        int secondLargest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
