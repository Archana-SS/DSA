//You are provided with an array of integers. These elements could be all positive, all negative or a combination of both. A sub-array is a smaller array formed using the elements of the original array. The condition for this problem is that the elements of the sub-array should be contiguous. Out of all the contiguous sub-arrays possible we need to find the maximum sum that can be formed

class Solution{
  public static int maximumSubarraySum(int arr[]){
    int sum=0;
    int max=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
      if(sum>max)
        max=sum;
      if(sum<0)
        sum=0;
    }
    return max;
  }
}

/* C++
  int sum=0;
  int max=INT_MIN;
  for(int i=0;i<arr.size();i++){
    sum+=arr[i];
    if(sum>max)
      max=sum;
    if(sum<0)
      sum=0;
  }
  return max;
*/

/* Python
  sum=0
  max=float('-inf')
  for i in range(len(arr)):
    sum+=arr[i]
    if sum>max:
      max=sum
    if sum<0:
      sum=0
return max
*/
