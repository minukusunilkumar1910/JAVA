package leetcode;
public class gcd_hcf {
   public static void main(String args[])
   {
       int a=52;
       int b=10;

       if(a>b)
       {
         a=a%b;
       }
       else
       {
         b=b%a;
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
