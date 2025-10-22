//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

class Solution{
  public boolean containsDuplicate(int nums[],int k){
    HashMap<Integer,Integer> mp=new HashMap<>();

    for(int i=0;i<nums.length;i++){
      if(mp.containsKey(nums[i]){
        int pastIndex=mp.get(nums[i]);
        if(Math.abs(pastIndex-i)<=k)
          return true;
        else
          mp.put(nums[i],i);
      }
      else
        mp.put(nums[i],i);
    }

    return false;
  }
}
