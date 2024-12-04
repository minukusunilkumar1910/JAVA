package maths;

public class countnum {
   public static void main(String[] args) {
      int n=13612;
      int count=0;
      while(n>0)
      {
         int last=n%10;
         count+=1;
         n=n/10;
      }
      System.out.println(count);
   }
}
