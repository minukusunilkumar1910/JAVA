package recursion;
/* 
public class NoOfZeros {
   public static void main(String[] args){
      System.out.println(count(30210)+"");
   }
   static int count(int n){
      return helper(n,0);
   }
   private static int helper(int n,int c)
   {
      if(n==0)
      {
         return c;
      }
      int rem=n%10;
      if(rem==0)
      {
         return helper(n/10,c+1);
      }
      return helper(n/10,c);
   }
}

public class NoOfZeros{
   public static void main(String[] args) {
       
   }
   static int count=0;
   static void zeros(int n)
   {
      if(n==0){
         return;
      }
      int rem =n%10;
      if(rem==0)
      {
         zeros(n/10);
         count++;
      }
      
   }
}
*/