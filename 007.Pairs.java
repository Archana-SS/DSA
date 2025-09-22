//You are given an array of unique integers and a target value. You need to find out the number of pairs that can be formed from the elements of the array such that their difference is the target value. 

class Solution{
  public static int pairs(List<Integer> arr,int k){
    int count=0;

    Collections.sort(arr);
    
    for(Integer i:arr){
      int requiredNum=i-k;

      if(binarySearch(arr,requiredNum)
         count++;
    }

    return count;
  }

  private static boolean binarySearch(List<Integer> arr,int requiredNum){
    int start=0,end=arr.size()-1;

    while(start<end){
      int mid=start+(end-start)/2;

      if(arr.get(mid)==requiredNum)
        return true;
      else if(arr.get(mid)<requiredNum)
        start=mid+1;
      else
        end=mid-1;
    }
    return false;
  }
}
