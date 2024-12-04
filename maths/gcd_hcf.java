package maths;

public class gcd_hcf {
   public static void main(String args[])
   {
      int a=12;
      int b=9;
       
      while(a>0 && b>0)
      {
         if(a>b)
         {
            a=a%b;
         }
         else{
            b=b%a;
         }
      }
      if(a==0)
      {
         System.out.println(b);
      }
      else{

         System.out.println(a);
      }
   }
}
