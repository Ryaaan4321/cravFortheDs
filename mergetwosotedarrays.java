package project190;

import java.util.Arrays;

public class mergetwosotedarrays {
    public static void merge(int arr1[] , int arr2[] ) {
        int n = arr1.length; // size of ist array..
        int m = arr2.length; // size of 2nd array..
        int arr1Point = 0;// ths will help us to traverse in the ist array 
        int arr2Point = 0; // this will help us tp traverse in the 2nd array
        int arr3Point = 0 ; // basicallly this pointer will help us to traverse in the third array
        int arr3[] = new int [n + m]; // because we want to store all the elements of both of the array  so simple shitt..!


        while(arr1Point < n &&  arr2Point < m){
            if(arr1[arr1Point] <= arr2[arr2Point]){
                arr3[arr3Point] = arr1[arr1Point];
                arr1Point++;
                arr3Point++;
            }else{
                arr3[arr3Point] = arr2[arr2Point];
                arr2Point++;
                arr3Point++;
            }


        }
        while(arr1Point < n){
          arr3[arr3Point] = arr1[arr1Point];
        }
        while(arr2Point  > m){
            arr3[arr3Point] = arr1[arr2Point];
        }
        for(int i = 0 ; i < n + m ; i++){
            if( i < n){
                arr1[arr1Point] = arr3[arr3Point];
            }else{
                arr2[arr2Point] = arr3[arr3Point];
            }
        }
    }    
    public static void merge1(long arr1[] , long arr2[] , int n , int m){

        int left = n -1;
        int right = 0;
        while(left < 0 && right < m){
            if(arr1[left] > arr2[right]){
             long temp   =   arr1[left];
             arr1[left] = arr2[right];
             arr2[right] = temp;
             left--;
             right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
    public  static void main(String[]args){
        int arr1[] = { 1 , 4 , 8 , 10};
        int arr2[] = { 2 , 3 , 9};
        int n = 4;
        
        int m = 3;
        merge(arr1, arr2);

        
        System.out.println("THe merged arrays arr : ");
        System.out.println("arr1[] = ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("arr2[] = ");
        for(int i = 0 ; i < m ; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
