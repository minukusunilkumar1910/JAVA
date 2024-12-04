package recursion;

public class SumOfindividual {
   public static void main(String[] args) {
      int n=1342;
    Sumindividual(n);  
    System.out.println(Sumindividual(n)+""); 
   }
   static int Sumindividual(int n)
   {
   if(n==0)
   {
      return 0;
   }
   return (n%10)+Sumindividual(n/10);
   }
}
