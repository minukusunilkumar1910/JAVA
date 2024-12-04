package maths;

public class reverse {
   
      public int reverse(int x) {
          int reverse=0;
          while(x>0)
      {   
          int last=x%10;
          reverse=(reverse*10)+last;
          x=x/10;
      }
      return reverse;
      }
  
}
