//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

//Method: It is based of divisibility rule of 9. If a number is completely divisible by 9 then sum of its digits is also 9. Else the sum of its digits will be the remainder.
class Solution{
  public int addDigits(int n){
    if(n==0)
      return 0;
    else if(n%9==0)
      return 9;
    else
      return (n%9);
  }
}
