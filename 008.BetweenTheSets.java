//Between Two Sets is a programming challenge on HackerRank. You need to find the multiples of first array and the divisors of second array.

/* There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist. */

//So we first find the common factors of first array. Then we find the common divisors of second array. Then we find the common elements between these two results.

class Solution{
  public static int betweenTheSets(List<Integer> a,List<Integer> b){
    int count=0;
    
    int lcm=a.get(0);

    for(Integer i:a){
      lcm=getLCM(lcm,i);
    }

    int gcd=b.get(0);
    for(Integer i:b){
      gcd=getGCD(gcd,i);
    }

    int multiple=0;

    while(multiple<=gcd){
      multiple+=lcm;
      if((gcd%multiple)==0)
        count++;
    }
    return count;
  }

  private static int getLCM(int a,int b){
    if(a==0 || b==0)
      return 0;
    else{
      int gcd=getGCD(a,b);
      return Math.abs(a*b)/gcd;
    }
  }

  private static int getGCD(int a,int b){
    if(b==0)
      return a;
    return getGCD(b,a%b);
  }
}
}
