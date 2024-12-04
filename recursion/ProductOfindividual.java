package recursion;

public class ProductOfindividual {
   public static void main(String[] args) {
      int n=1342;
      Product(n);
      System.out.println(Product(n)+"");
   }
   static int Product(int n)
   {
      if(n%10==n)                          //return value n
      {
         return n;
      }
      return (n%10)*Product(n/10);
   }
}
