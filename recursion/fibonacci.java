package recursion;

public class fibonacci {
   public static void main(String[] args) {
      int r= fibo(5);
       System.out.println(r+"");
   }
   static int  fibo(int n)
   {
     if(n==1 ||n==0){
      return n;
     }
      
     return fibo( n-1) + fibo(n-2);
 
   
   }
}
