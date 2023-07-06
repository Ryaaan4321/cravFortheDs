 //Given an integer num, return three consecutive integers (as a sorted array) that sum to num. 
//If num cannot be expressed as the sum of three consecutive integers, return an empty array.
//Input: num = 33
//Output: [10,11,12]
//Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
//10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
// 2177. Find Three Consecutive Integers That Sum to a Given Number
// we need to return the three interes tht sum to zero so tht means if they are not divided by 3 then they are not
// numbers so we will take advantage of tht and use tht as our base condition


// and if it is divided by 3 then the prev of tht element and the next of tht element will be returned as our ans;
class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 != 0) 
        return new long[]{ };

        long a = num / 3;
        return new long[] {a - 1 , a , a + 1};
        
    }
}
