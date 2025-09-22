//You are given an array of all positive integers. All the integers are repeated exactly twice except one. We need to find that number with a linear time complexity and using the minimum space possible.

class solution{
  public static int singleNumber(int arr[]){
    int ans=ar[0];

    for(int i=1;i<arr.length;i++){
      ans^=arr[i];
    }

    return ans;
  }
}

/* C++
  int ans=arr[0];
  for(int i=1;i<arr.size();i++){
    ans^=arr[i];
  }
  return ans;
*/

/* Python
  ans=arr[0]
  for i in range(1,len(arr)):
    ans^=arr[i]

  return ans
*/
