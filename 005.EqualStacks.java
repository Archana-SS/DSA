//Equal Stacks is a programming challenge on HackerRank that uses the stack data structure. You need to balance out 3 stacks such that they have the maximum height.

class Solution{
  public static int equalStacks(List<Integer> h1,List<Integer> h2,List<Integer> h3){
    int maxHeight=0;

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    Stack<Integer> s3=new Stack<>();

    fillStacks(s1,h1,s2,h2,s3,h3);

    while(!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()){
      int s1Ht=s1.peek();
      int s2Ht=s2.peek();
      int s3Ht=s3.peek();

      if(s1Ht==s2Ht && s1Ht==s3Ht){
        maxHeight=s1.peek();
        break;
      }
      else if(s1Ht>=s2Ht && s1Ht>=s3Ht)
        s1.pop();
      else if(s2Ht>=s1Ht && s2Ht>=s3Ht)
        s2.pop();
      else if(s3Ht>=s1Ht && s3Ht>=s2Ht)
        s3.pop();
    }

    return maxHeight;
  }

  private void fillStacks(Stack<Integer> s1,List<Integer> h1,Stack<Integer> s2,List<Integer> h2,Stack<Integer> s3,List<Integer> h3){
    int s1TotalHt=0,s2TotalHt=0,s3TotalHt=0;

    for(int i=h1.size()-1;i>=0;i--){
      s1TotalHt+=h1.get(i);
      s1.push(s1TotalHt);
    }

    for(int i=h2.size()-1;i>=0;i--){
      s2TotalHt+=h2.get(i);
      s2.push(s2TotalHt);
    }

    for(int i=h3.size()-1;i>=0;i--){
      s3TotalHt+=h3.get(i);
      s3.push(s3TotalHt);
    }
  }
}
    
