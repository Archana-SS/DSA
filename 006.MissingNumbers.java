//Missing Numbers is a programming challenge on HackerRank. You are given an array, and an artist is trying to transport those numbers to a different array. In the process, he misses some of those numbers. These are termed as missing numbers. We need to find these numbers in a sorted manner.
//arr: array with missing numbers
//brr: array with original numbers

class Solution{
  public static List<Integer> missingNumbers(List<Integer> arr,List<Integer> brr){
    TreeMap<Integer,Integer> mp=new TreeMap<>();

    for(Integer i:brr){
      int freq=mp.getOrDefault(i,0);
      freq++;
      mp.put(i,freq);
    }

    for(Integer i:arr){
      int freq=mp.getOrDefault(i,0);
      freq--;
      if(freq==0)
        mp.remove(i);
      else
        mp.put(o,freq);
    }

    List<Integer> result=new ArrayList<>();
    
    for(Map.Entry<Integer,Integer> it:mp.entrySet()){
      result.add(it.getKey());
    }

    return result;
  }
}
      
    
