class Solution{
  // so once again if u dont know the concept of the recursion and backtracking then its better tht u  go and watch the leactures and go through the documentation or go scroll 
  // instagram atleast hasi ayegi//
    public void recurPermute(int nums[] , List<Integer> ds  , List<List<Integer>> ans , boolean [] freq){
      // so t solve this we took one additional ds( data structue ) t store the vales and one ans to store the permutations.

      // so here if we ask about the base case then its definetly the nums.length if the iteration is in the the last element then its obvious tht we are in the end of the array
      // so no permutaions after tht element so return. and the elements of the ds in the ans
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
      // here because we need to check for all the elemnts so we are iterating over the array to get to know tht whcich element is taken and which is not
      // if it is not taken then marking it true and adding elements in the ds and calling the calls of tthe recursions
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums , ds , ans , freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
             }
        }
    }

    public List<List<Integer>> permute(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recurPermute(nums ,ds , ans , freq);
        return ans;
    }
}
