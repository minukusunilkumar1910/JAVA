package recursion;

public class sumofOne_to_n {
   public static void main(String[] args) {
       int n=1;
       int result=numbers(n);
       System.out.println(result+"");
   }
   static int numbers(int n)
   {
      if(n == 5)
      {
         return n;
      }
       int res = n+numbers(n + 1);
       return res;
      
   }
}
