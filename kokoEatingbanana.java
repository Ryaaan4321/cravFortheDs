package striver.binarysearch;

public class kokoEatingbanana {
//LEETCODE : 875
// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
// The guards have gone and will come back in h hours.
//Koko can decide her bananas-per-hour eating speed of k. Each hour,
// she chooses some pile of bananas and eats k bananas from that pile.
// If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
//Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
//Return the minimum integer k such that she can eat all the bananas within h hours.

   //Input: piles = [3,6,7,11], h = 8
   //Output: 4
   // so lets dive deeper into tht question so koko loves to eat bananas bt the guard is a mf nd he is 
   // not in a space so kokoo got a chance to eat bananaas bt the condition is she has only (H)hrs of time
   // and on tht time constraint she have to eat all that bananas tht she loves most to eat
   // and for tht lets find out max no of  banana she can eat and for tht findmax func will help us.. 
    public  static int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }
    // once we get tht now the time she will toook to eat tht banans is the condition bcs guard is a mf
    //and for tht in this methods we calculte the time she took to eat all the bananas
    //taking piles and hrs as input and traversing through a looop and getting the value of the totalhrs koko
    //will take to eat tht bananaa

    public static int totalTimeTaken(int[] piles, int h) {
        int totalHrs = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {// nd to find out the time she will took to each tht bannan dividing
            //the piles with an hr
            // tht will return the time koko will take to eat tht bananapill
            totalHrs += Math.ceil((double) piles[i] / h);
        }
        return totalHrs;
    }
    // and after tht now its time to search out  for  the minimun amount of time she will take 
    // to eat tht bananaa and once its comes to search yess binary search

    public  static int minEatingSpeed(int[] piles, int h) {
        int low = 1;  //starting from the forst index
        int high = findMax(piles); // searching till the highest value of the index..
        while (low <= high) { // bnary search condition
            int mid = (low + high) / 2;
            int totalH = totalTimeTaken(piles, mid);// time takennn
            if (totalH <= h) {// if tht total time kokotake to eat mango is less then the time we have
                // then search in the left search space and eleminate the right search space
                high = mid - 1;
            } else { // else search in the left seach space and search in the right search space
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[]args){
        int piles[] = { 2 , 3 , 5 , 1};
        int h = 5;
        int minHr = minEatingSpeed(piles, h);
        System.out.println("The minimum time koko will take to eat tht bananas = " +minHr);

    }
}
