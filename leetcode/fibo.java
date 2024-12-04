package leetcode;
public class fibo {
   public static void main(String args[])
   {
      int n=6;
      
      int r=fibo(n);
      System.out.println(r);

   }

   static int fibo(int n)
   {
      if(n==1||n==0)
      {
         return n;
      }
      int res=fibo(n-1)+fibo(n-2);
      return res;
   }
}
